# reactive-spring-webflux-mongodb-microservice
How to use reactive programming in the Java world and why it's worth the hype?
This application handles order processing with real-time updates and data streaming. It's a reactive microservice using Spring Boot, Spring WebFlux, and MongoDB.

## MongoDB Configuration

`docker run --name reactive-mongo -p 27017:27017 -d mongo:latest`

## API Testing

**Place an Order (POST):** `http://localhost:8080/api/orders`

In Postman, in the “Body” tab, select “raw” and “JSON”. Enter a sample order in JSON format, like this:
`{     
"productId": "Product-123",     
"quantity": 2
}`

**Get Order by ID (GET):** `http://localhost:8080/api/orders/{orderId}`

**Get All Orders (GET):** `http://localhost:8080/api/orders`

**Get Orders by Product ID (GET):** `http://localhost:8080/api/orders/product/{productId}`

**Real-time Order Stream (GET):** `http://localhost:8080/api/orders/stream`

🎥 Watch the associated **video** 👉 [How to Build a Reactive Microservice with Spring WebFlux & MongoDB](https://youtu.be/y5CsYhadZiA)

📖 Read the associated **article**  👉 [Build a Reactive Microservice with Spring WebFlux & MongoDB](https://code.likeagirl.io/spring-webflux-reactive-programming-dbb54540c465?sk=cdacd533da01245c15323d612a322ac7)

**Ready to level up your skills?**

🎁 Join 36K+ students and get my **video courses with FREE and DISCOUNT** coupons (available for a limited time):

### 🔥 [Modern Software Engineering: Architecture, Cloud & Security](https://www.udemy.com/course/software-security-gen-ai/?couponCode=ECBF55CA014D462D962B):
**Discount** Coupon: ECBF55CA014D462D962B

### 🐳 [Getting Started with Docker & Kubernetes](https://www.udemy.com/course/kubernetes-docker-practical-guide/?couponCode=CED9351287EC48DDD678):
**FREE** coupon CED9351287EC48DDD678

### 🔥 [Secure Software Development: Principles, Design, and Gen-AI](https://www.udemy.com/course/software-security-gen-ai/?couponCode=030A049988901A8353F5)
**FREE** coupon: 030A049988901A8353F5

### 💯 [Master API Design](https://www.udemy.com/course/master-api-design-authentication-and-authorization/?couponCode=2FA5D04F3ABDF1D098E6):
**FREE** coupon: 2FA5D04F3ABDF1D098E6

### 🚀 [Web Performance Optimization](https://www.udemy.com/course/identify-and-fix-javascript-memory-leaks/?couponCode=8C3597F410F1D186AB56):
**FREE** Coupon: 8C3597F410F1D186AB56

💡 🧠  I share content about engineering, technology, and leadership for a community of smart, curious people. Subscribe to my YouTube channel https://www.youtube.com/@tekforge & join my newsletter for more insights and tech updates: https://rakiabensassi.substack.com

Follow me on Medium: https://rakiabensassi.medium.com
