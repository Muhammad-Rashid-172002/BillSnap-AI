import 'package:flutter/material.dart';

class AiInsightsPage extends StatelessWidget {
  const AiInsightsPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("AI Insights")),
      body: const Center(
        child: Text(
          "Your AI-generated financial insights will appear here 💡",
          textAlign: TextAlign.center,
        ),
      ),
    );
  }
}
