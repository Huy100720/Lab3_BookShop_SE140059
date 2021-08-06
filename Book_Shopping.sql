
CREATE DATABASE Book_Shopping

CREATE TABLE tblRoles(
roleID varchar(10) PRIMARY KEY,
roleName varchar(50) not null,  
);

CREATE TABLE tblUsers(
userID varchar(50) PRIMARY KEY,
password varchar(50) not null,
userName nvarchar(50) not null,
wallet float not null,
gender varchar(10) not null,
email varchar(70) not null,
address varchar(70) not null,
phone varchar(10) not null,
avatar varchar(200) not null,
createDate date not null,
roleID varchar(10) FOREIGN KEY REFERENCES tblRoles(roleID),
status varchar(10) not null,
);

CREATE TABLE tblCategories(
categoryID varchar(10) PRIMARY KEY,
categoryName varchar(50) not null, 
)

CREATE TABLE tblBooks(
bookID varchar(10) PRIMARY KEY,
bookTitle varchar(70) not null,
bookImage varchar(200) not null,
description varchar(1000) not null,
price float not null,
quantity int not null,
author varchar(50) not null,
createDate date not null,
categoryID varchar(10) FOREIGN KEY REFERENCES tblCategories(categoryID),
bookStatus varchar(10) not null,
);

CREATE TABLE tblDiscounts (
discountID varchar(30) PRIMARY KEY,
discPercent int not null,
createDate DATE not null,
);

CREATE TABLE tblUsers_Discounts(
id int IDENTITY(1,1) PRIMARY KEY not null,
discountID varchar(30) FOREIGN KEY REFERENCES tblDiscounts(discountID),
userID varchar(50) FOREIGN KEY REFERENCES tblUsers(userID),
);

CREATE TABLE tblOrders(
orderID int IDENTITY(1,1) PRIMARY KEY not null,
orderDate date not null,
totalOfOrder float not null,
discountID varchar(30) FOREIGN KEY REFERENCES tblDiscounts(discountID),
userID varchar(50) FOREIGN KEY REFERENCES tblUsers(userID),
);

CREATE TABLE tblOrderDetails (
orderDetailID int IDENTITY(1,1) PRIMARY KEY not null,
price float not null,
quantity int not null,
total float not null,
orderDate date not null,
bookID varchar(10) FOREIGN KEY REFERENCES tblBooks(bookID),
orderID int FOREIGN KEY REFERENCES tblOrders(orderID),
);


--Drop table tblOrderDetails
--Drop table tblOrders
--Drop table tblBooks
--Drop table tblCategories
--Drop table tblUsers_Discounts
--Drop table tblUsers
--Drop table tblDiscounts



	INSERT INTO tblRoles(roleID, roleName)
	VALUES ('Adm', 'Administrator'),
		   ('Us', 'User');

	INSERT INTO tblUsers (userID, password, userName, wallet, gender, email, address, phone, avatar, createDate, roleID, status)
	VALUES ('namchamvang6','123','Trinh Gia Huy', 1000, 'Male', 'huyem100720@gmail.com', '385/46 P.Tam Hiep Tp.Bien Hoa', '1234567890', 'https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Golden_tabby_and_white_kitten_n03.jpg/300px-Golden_tabby_and_white_kitten_n03.jpg', '2021-05-01', 'Adm', 'Active'),
		   ('belenba','123','Thai Duc Loi', 1000, 'Male', 'thaiducloi2000@gmail.com', '457/33 Tp.HCM', '0358339090', 'https://media-cldnry.s-nbcnews.com/image/upload/newscms/2019_06/2742091/190205-batman-ben-affleck-se-108p-2742091.jpg', '2021-06-06', 'Us', 'Active'),
		   ('concobebe','123','Duong Kim Long', 1000, 'Male', 'zeroVip223@gmail.com', '20/34 Tp.HCM', '9999999999', 'https://i.pinimg.com/originals/a3/5a/9c/a35a9c65e3c4bb6684fef318ba04c43b.png', '2021-06-10', 'Us', 'Active');
  
     INSERT INTO tblCategories(categoryID, categoryName)
	 VALUES ('C001', 'Art & Photography'),
	        ('C002', 'Graphic Novels, Anime & Manga'),
			('C003', 'Children''s Books'),
			('C004', 'Science Fiction, Fantasy & Horror'),
			('C005', 'Computing');

     INSERT INTO tblBooks(bookID, bookTitle, bookImage, description, price, quantity, author, createDate, categoryID, bookStatus)
	 VALUES ('B001', 'A Marvelous Life : The Amazing Story of Stan Lee', 'Stan_Lee.png',
	 'Stan Lee invented SPIDER-MAN! And IRON MAN! And the HULK! And the X-MEN! And more than 500 other iconic characters! His name has appeared on more than a billion comic books, in 75 countries, in 25 languages. His creations have starred in multibillion-dollar grossing movies and TV series. This is his story.', 
	 15.89, 20, 'Danny Fingeroth', '2021-10-05', 'C001', 'Active'),

            ('B002', 'Rememberings', 'Remembering.png',
	 'Rememberings is intimate, replete with candid anecdotes and full of hard-won insights. It is a unique and remarkable chronicle by a unique and remarkable artist.', 
	 32.11, 30, 'Sinead O''Connor', '2021-10-05', 'C001', 'Active'),

            ('B003', 'Marvel-verse: Thanos', 'Thanos.png',
	 'Thanos is one of the deadliest villains in the Marvel-Verse - and these are some of his greatest tales of conquest! Thanos'' sinister debut leads Iron Man into battle with Drax the Destroyer!', 
	 15.21, 20, 'Marvel Comics', '2021-10-05', 'C002', 'Active'),

            ('B004', 'Overlord, Vol. 1 (light novel) : The Undead King', 'OverLord.png',
	 'For twelve years, the virtual world of Yggdrasil has served as the playground and battlefield for the skeletal lord Momonga and his guild of fellow monsters, Ainz Ooal Gown. But the guild''s glory days are over, and the game is shutting down permanently. When Momonga logs in one last time just to be there when the servers go dark, something happens-and suddenly, fantasy is reality. A rogues'' gallery of fanatically devoted NPCs is ready to obey his every order, but the world Momonga now inhabits is not the one he remembers. The game may be over, but the epic tale of Ainz Ooal Gown is only beginning...', 
	 27.57, 25, 'Kugane Maruyama', '2021-10-05', 'C002', 'Active'),

            ('B005', 'The Koala Who Could', 'Koala.png',
	 'Meet Kevin. A koala who likes to keep things the same. Exactly the same. But sometimes change comes along whether we like it or not... And, as Kevin discovers, if you step outside your comfort zone and try new things, you might just surprise yourself!', 
	 12.81, 20, 'Rachel Bright', '2021-10-05', 'C003', 'Active'),

            ('B006', 'Be Kind', 'Be_Kind.png',
	 'With award-winning author Pat Zietlow Miller''s gentle text and Jen Hill''s irresistible art, Be Kind is an unforgettable story about how simple acts can change the world.', 
	 12.52, 30, 'Pat Zietlow Miller', '2021-10-05', 'C003', 'Active'),

            ('B007', 'The Atlas Six', 'The_Atlas_Six.png',
	 'The Alexandrian Society, caretakers of lost knowledge from the greatest civilizations of antiquity, are the foremost secret society of magical academicians in the world', 
	 27.98, 20, 'Olivie Blake', '2021-10-03', 'C004', 'Active'),

            ('B008', 'Dreams of the Dying : The Dark Corners of Our Minds', 'Dream_Of_Dying.png',
	 'If your mind is the enemy, where do you run?', 
	 59.59, 40, 'Nicolas Lietzau', '2021-10-04', 'C004', 'Active'),

            ('B009', 'Web Design with HTML, CSS, JavaScript and jQuery Set', 'JavaScript_Jquery.png',
	 'A two-book set for web designers and front-end developersThis two-book set combines the titles `HTML & CSS: Designing and Building Web Sites` and `JavaScript & jQuery: Interactive Front-End Development.', 
	 61.26, 35, 'Jon Duckett', '2021-12-05', 'C005', 'Active');

	 INSERT INTO tblDiscounts (discountID, discPercent, createDate)
	 VALUES ('none', 0, '2021-05-04'),
	        ('code1', 15, '2021-12-05'),
	        ('code2', 20, '2021-10-15');





