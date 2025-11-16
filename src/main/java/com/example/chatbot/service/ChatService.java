package com.example.chatbot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

@Service
public class ChatService {

    @Value("${OPENAI_API_KEY}")
    private String openaiApiKey;

    private static final String OPENAI_URL = "https://api.openai.com/v1/chat/completions";

    public String getChatResponse(String message) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(openaiApiKey);

            JSONObject requestBody = new JSONObject();
            requestBody.put("model", "gpt-4o-mini"); // 👈 modelo atualizado
            requestBody.put("messages", new org.json.JSONArray()
                    .put(new JSONObject().put("role", "user").put("content", message))
            );

            HttpEntity<String> entity = new HttpEntity<>(requestBody.toString(), headers);
            ResponseEntity<String> response = restTemplate.postForEntity(OPENAI_URL, entity, String.class);

            JSONObject jsonResponse = new JSONObject(response.getBody());
            return jsonResponse
                    .getJSONArray("choices")
                    .getJSONObject(0)
                    .getJSONObject("message")
                    .getString("content");

        } catch (Exception e) {
            return "⚠️ Erro ao processar: " + e.getMessage();
        }
    }
}
