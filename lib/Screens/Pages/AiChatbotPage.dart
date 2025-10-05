import 'package:flutter/material.dart';

class Aichatbotpage extends StatefulWidget {
  const Aichatbotpage({super.key});

  @override
  State<Aichatbotpage> createState() => _AichatbotpageState();
}

class _AichatbotpageState extends State<Aichatbotpage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('AI Chatbot')),
    );
  }
}