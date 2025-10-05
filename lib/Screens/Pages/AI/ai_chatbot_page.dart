import 'package:flutter/material.dart';

class AiChatbotPage extends StatelessWidget {
  const AiChatbotPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("AI Finance Chatbot")),
      body: const Center(
        child: Text(
          "Chat with your AI Finance Assistant here 💬",
          textAlign: TextAlign.center,
        ),
      ),
    );
  }
}
