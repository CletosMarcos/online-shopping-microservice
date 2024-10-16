package com.microservices.notification.service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {

    @KafkaListener(topics = "order-placed")
    public void listen() {}


}
