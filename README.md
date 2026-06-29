# AI Email Writer Assistant

An AI-powered Chrome Extension that generates professional email replies directly inside Gmail using Google's Gemini API.

## Features

- AI-generated email replies inside Gmail
- Spring Boot REST API backend
- Chrome Extension integration
- Tone-based reply generation
- Secure configuration using environment variables
- Dockerized application for consistent deployment

## Tech Stack

- Java 21
- Spring Boot
- Spring Web & WebFlux (WebClient)
- Google Gemini API
- Docker
- JavaScript
- HTML
- CSS
- Chrome Extension

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
├── backend/             # Spring Boot Application
└── chrome-extension/    # Chrome Extension
```

## Run Locally

1. Clone the repository.

2. Set the following environment variables:

```
GEMINI_URL
GEMINI_KEY
```

3. Run using Spring Boot:

```bash
mvn spring-boot:run
```

**OR**

Run using Docker:

```bash
docker build -t email-writer .
docker run -p 8080:8080 \
-e GEMINI_URL=<YOUR_GEMINI_URL> \
-e GEMINI_KEY=<YOUR_GEMINI_API_KEY> \
email-writer
```

4. Load the Chrome Extension in **Developer Mode**.

5. Start generating AI-powered email replies directly inside Gmail.

---

Built using **Spring Boot**, **Docker**, **Google Gemini API**, and **Chrome Extensions**.