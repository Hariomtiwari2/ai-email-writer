# AI Email Writer Assistant

An AI-powered Chrome Extension that generates professional email replies directly inside Gmail using Google's Gemini API.

## Features

- AI-generated email replies inside Gmail
- Spring Boot REST API backend
- Chrome Extension integration
- Tone-based reply generation
- Secure configuration using environment variables

## Tech Stack

- Java 21
- Spring Boot
- Spring Web & WebFlux (WebClient)
- Google Gemini API
- JavaScript
- HTML/CSS
- Chrome Extension
- AWS Lambda
- AWS API Gateway

## API

**POST** `/api/email/generate`

```json
{
  "emailContent": "Can we schedule a meeting tomorrow?",
  "tone": "Professional"
}
```

## Project Structure

```
email-writer/
├── Backend (Spring Boot)
└── Chrome Extension
```

## Run Locally

1. Clone the repository
2. Set the following environment variables:

```
GEMINI_URL
GEMINI_KEY
```

3. Run the Spring Boot application
4. Load the Chrome Extension in Developer Mode
5. Start generating AI-powered email replies

---

Built using Spring Boot, Google Gemini API, AWS Lambda, and Chrome Extensions.
