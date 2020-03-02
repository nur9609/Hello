Homework greetgo!
1. Чтобы скачать проект, запускаем команду:
	git clone https://github.com/nur9609/hello.git
2. Чтобы запустить сервер, перейдите в папку hello/Mybatis:
	cd hello/Mybatis
3. И запустите с помощью команды:
	java -jar Mybatis-0.0.1-SNAPSHOT.jar
3. Ждем пока запуститься сервер. После чтобы запустить клиентскую часть, 
запускаем команду, переходим в папку hello/client: 
	cd hello/client
4. И запускаем с помощью команды:
	npm install && npm start
4. Далее заходим в браузере по адресу:
	http://localhost:4200/note
5. Видим результат Hello World!
6. Заходим сюда http://localhost:8000/h2-console 
7. Введите следующее для 
	JDBC URL:  jdbc:h2:mem:testdb
	User Name: sa
	Password:  оставить пустым
	Нажмите Connect
9. Далле нажмите на NOTE и Run
10. Далее чтобы изменить БД, нажмите на Edit и меняйте 
11. Возвращаемся на страницу  http://localhost:4200/note и обновляем. 
	Смотрим что сообщение обновилось.
