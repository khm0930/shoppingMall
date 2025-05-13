# ⏰ 대규모 트래픽 대응을 위한 클라우드 네이티브 타임딜 서비스

## 📋 프로젝트 소개
본 프로젝트는 **대규모 트래픽 처리**와 **확장성 있는 클라우드 아키텍처**를 설계하여 타임딜 서비스를 안정적이고 효율적으로 제공하기 위해 시작되었습니다.  
특정 시간에 상품 구매 시 발생하는 폭발적인 트래픽을 **AWS 기반 클라우드 서비스**를 활용해 관리하고, 오토스케일링과 분산 처리 기술을 통해 **높은 가용성과 안정성**을 확보했습니다.

---

<img width="700" alt="스크린샷 2025-01-10 오후 8 41 07" src="https://github.com/user-attachments/assets/7d06469b-2dd8-4cf8-ac1a-3e4b660c9529" />

---

## 🎯 핵심 목표
- 트래픽 폭주 상황에서도 안정적으로 서비스를 제공할 수 있는 인프라 구성
- 클라우드 네이티브 아키텍처 기반 확장성 확보
- GitOps 방식의 자동화된 CI/CD 구축
- 모니터링 및 장애 대응 체계 마련

---

## 📦 주요 작업
- **AWS 인프라 설계 및 구축**
- **ECS 환경 → EKS 클러스터 전환**
- **GitHub Actions + ArgoCD를 통한 배포 자동화**
- **ELK Stack 구축을 통한 백엔드 서비스 로그 수집**
- **CloudWatch 기반 모니터링 및 알림 체계 구축**
- **Secrets Manager + SecretProviderClass를 통한 시크릿 관리 강화**

---

## 🛠️ 사용 기술
- **AWS**: EC2, ECS, EKS, RDS, S3, CloudFront, WAF, CloudWatch
- **CI/CD**: GitHub Actions, ArgoCD
- **모니터링**: ELK Stack (Elasticsearch, Logstash, Kibana), AWS CloudWatch
- **보안**: AWS Secrets Manager, CSI Driver
- **테스트**: K6 (부하 테스트)

---

## 🖥️ 아키텍처 구성
> AWS 기반의 인프라 아키텍처 구성도
![타임딜 아키텍처 다이어그램](https://github.com/user-attachments/assets/fb13ef07-f216-4ec3-9e10-8a6a2a5434ac)
---

## 🗃️ 데이터베이스 설계
> 사용자, 상품, 주문 관리를 위한 RDS(MySQL) 스키마 설계

<img width="800" alt="스크린샷 2025-01-09 오전 3 13 15" src="https://github.com/user-attachments/assets/55828a2c-7e3c-486e-91ed-be463861ffde" />

---

## 📈 모니터링 & 운영 체계 구축

### ELK Stack 기반 백엔드 로그 모니터링
- 서비스의 에러, 장애 패턴 분석
- 요청/응답 흐름 추적
- Kibana 대시보드를 통한 실시간 조회 및 검색

**[Kibana 대시보드]**

![Kibana Dashboard 1](https://github.com/user-attachments/assets/72cc87c9-025c-408a-8ca4-a39c5384e943)

![Kibana Dashboard 2](https://github.com/user-attachments/assets/967b1545-b6dd-4e38-8941-a0b6175f66fe)

---

### AWS CloudWatch 기반 시스템 리소스 모니터링
- CPU 사용률, 메모리 사용량 등 주요 지표 수집
- 알람을 통한 장애 사전 감지 및 대응

**[CloudWatch Monitoring]**

![CloudWatch Monitoring](https://github.com/user-attachments/assets/221376f1-96e3-4860-a523-85853be56f27)

---

## ⚙️ CI/CD 구축
- **ECS 환경**: GitHub Actions → ECR → ECS 배포 (약 6분 소요)
- **EKS 전환 후**: GitHub Actions → ArgoCD GitOps 자동화 배포 (약 1분 30초 이내)

---

## 📈 기대 효과
- **확장성**: 트래픽 폭주 상황에서도 안정적으로 대응 가능한 구조 확보
- **운영 효율성**: GitOps 기반 자동화 배포를 통해 배포 리드타임 단축
- **비용 최적화**: 예약 스케일링 및 오토스케일링 정책 도입으로 리소스 최적 사용
- **운영 신뢰성 강화**: CloudWatch, ELK Stack을 통한 장애 탐지 및 빠른 복구 대응 체계 구축

---

## 👨‍💻 주요 담당 작업
- 인프라 아키텍처 설계 및 구축
- EKS 클러스터 전환 및 GitOps 자동화
- ELK Stack 기반 로그 수집 및 분석 환경 구축
- 시스템 모니터링 및 장애 대응 체계 수립
- 클라우드 비용 최적화 전략 수립

---

# 📌 정리
> 단순히 인프라를 구축한 것에 그치지 않고,  
> **운영 효율성, 보안, 비용 절감까지 고려하여** 클라우드 네이티브 환경을 스스로 설계하고 개선한 경험입니다.

---

