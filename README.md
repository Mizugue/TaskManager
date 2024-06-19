# Task Manager
- *I. Techonologies *
  - Hibernate + Mysql -> Spring DATA jpa
  - Spring boot
  - Thymeleaf
  ------------------
WEB INTERFACE -> 5 templates 

> Main
![tasks](https://github.com/Mizugue/TaskManager/assets/126506298/86263ded-2031-4fcb-aa8c-7819e005e013)


 ------------------
API REST -> 5 endpoints <CRUD> 
> ex: (GET)/api/tasks
  output:
    {
        "id": 27,
        "title": "Jogar no bicho",
        "description": "Preciso fazer uma fézinha esse ano para garantir a aposentadoria",
        "creation_date": "2024-06-19T20:12:35.000+00:00",
        "expiration_date": "2025-01-01T02:59:00.000+00:00",
        "status": "in_progress",
        "image_url": "https://miro.medium.com/v2/resize:fit:848/1*Zq9NTrxb5UcwF6jzZBvSHw.jpeg"
    },
    {
        "id": 24,
        "title": "Academia",
        "description": "Treino de costas",
        "creation_date": "2024-06-19T20:07:42.000+00:00",
        "expiration_date": "2024-06-20T14:30:00.000+00:00",
        "status": "pending",
        "image_url": "https://www.designi.com.br/images/preview/11060049.jpg"
    }



