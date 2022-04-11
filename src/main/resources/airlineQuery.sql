use airlinereservation;
insert into flight_details(flight_id, flight_number, flight_name, source, destination, distance, luggage, departure_date, departure_time, arrival_date, arrival_time, image_name, extra_facility, duration) values
(1,"Ar1-02", "Indigo", "PUNE", "DELHI", 1173,"15kg","2022-05-15","07:30:00", "2022-05-15","09:50:00","ind58.png","Wifi,Meal,Plug","2 hr 20 min"),
(2,"G8-334", "Go First", "PUNE", "DELHI", 1173,"15kg","2022-05-15","18:50:00", "2022-05-15","21:05:00","Go58.png","Meal,Plug","2 hr 15 min"),
(3,"AI-868", "Air India", "DELHI", "PUNE", 1173,"15kg","2022-05-15","04:55:00", "2022-05-15","07:00:00","airindia58.png","Wifi","2 hr 5 min"),
(4, "Ar1-02", "Vistra", "DELHI", "PUNE", 1173, "15kg", "2022-05-15","16:10:00", "2022-05-15","18:10:00", "vinset58.png", "Wifi,Meal", "2 hr 0 min"),
(5, "Em-02", "Emariates", "PUNE", "CHENNAI", 912,"15kg", "2022-05-15","01:40:00", "2022-05-15","03:20:00", "emirates58.png", "Wifi,Meal,Plug", "1 hr 40 min"),
(6, "Ar2-02", "Indigo-2", "PUNE", "CHENNAI", 912,"15kg", "2022-05-15","21:30:00", "2022-05-15","23:15:00", "ind58.png", "Wifi,Meal,Plug", "1 hr 45 min"),
(7, "SG-8157", "SpiceJet", "CHENNAI", "PUNE", 912,"15kg", "2022-05-15", "01:05:00", "2022-05-15", "02:50:00", "spice58.png", "Wifi,Meal,Plug", "1 hr 45 min"),
(8, "I5-784", "Air Asia", "CHENNAI", "PUNE", 912,"15kg", "2022-05-15","14:40:00","2022-05-15","16:30:00", "airasia58.png", "Wifi,Meal,Plug", "1 hr 50 min"),
(9, "AI-411", "Air India", "PUNE", "KOLKATA", 1575,"15kg", "2022-05-15","13:40:00","2022-05-15","16:10:00", "airindia58.png", "Wifi,Meal,Plug", "2 hr 30 min"),
(10, "6E-744", "Spice Jet", "PUNE", "KOLKATA", 1575,"15kg", "2022-05-15","06:05:00","2022-05-15","08:35:00", "spice58.png", "Plug", "2 hr 30 min"),
(11, "G8-334", "Go First", "KOLKATA", "PUNE",1575,"15kg", "2022-05-15","15:30:00", "2022-05-15","18:00:00", "Go58.png", "Meal,Plug", "2 hr 30 min"),
(12, "AI-868", "Air India", "KOLKATA", "PUNE", 1575,"15kg","2022-05-15","06:00:00", "2022-05-15","08:30:00", "airindia58.png", "Wifi", "2 hr 30 min"),
(13, "Ar1-02", "Vistra", "PUNE", "HYDERABAD", 504,"15kg", "2022-05-15","00:05:00", "2022-05-15","01:20:00", "vinset58.png", "Wifi,Meal", "1 hr 15 min"),
(14, "Em-02", "Emariates", "PUNE", "HYDERABAD", 504,"15kg", "2022-05-15","06:25:00","2022-05-15","07:35:00", "emirates58.png", "Wifi,Meal,Plug", "1 hr 10 min"),
(15, "Ar2-02", "Indigo-2", "HYDERABAD", "PUNE", 504,"15kg", "2022-05-15","13:15:00", "2022-05-15 ","15:25:00", "ind58.png", "Wifi,Meal,Plug", "1 hr 30 min"),
(16, "SG-8157", "SpiceJet", "HYDERABAD", "PUNE", 504,"15kg", "2022-05-15","06:30:00", "2022-05-15 ","08:00:00", "spice58.png", "Wifi,Meal,Plug", "1 hr 30 min"),
(17,"Ar1-02", "Indigo", "PUNE", "MUMBAI", 118,"15kg","2022-05-15","15:05:00", "2022-05-15","12:50:00","ind58.png","Wifi,Meal,Plug","0 hr 45 min"),
(18,"G8-334", "Go First", "PUNE", "MUMBAI", 118,"15kg","2022-05-15","18:00:00", "2022-05-15","18:45:00","Go58.png","Meal,Plug","0 hr 45 min"),
(19,"AI-868", "Air India", "MUMBAI", "PUNE", 118,"15kg","2022-05-15","04:00:00", "2022-05-15","04:45:00","airindia58.png","Wifi","0 hr 45 min"),
(20, "Ar1-02", "Vistra", "MUMBAI", "PUNE", 118,"15kg", "2022-05-15","17:15:00", "2022-05-15","18:00:00", "vinset58.png", "Wifi,Meal", "0 hr 45 min"),
(21, "Em-02", "Emariates", "PUNE", "BANGALORE", 734,"15kg", "2022-05-15","19:10:00", "2022-05-15","20:30:00", "emirates58.png", "Wifi,Meal,Plug", "1 hr 20 min"),
(22, "Ar2-02", "Indigo-2", "PUNE", "BANGALORE", 734,"15kg", "2022-05-15","01:00:00", "2022-05-15","02:35:00", "ind58.png", "Wifi,Meal,Plug", "1 hr 35 min"),
(23, "SG-8157", "SpiceJet", "BANGALORE", "PUNE", 734,"15kg", "2022-05-15", "07:35:00", "2022-05-15", "09:20:00", "spice58.png", "Wifi,Meal,Plug", "1 hr 45 min"),
(24, "I5-784", "Air Asia", "BANGALORE", "PUNE", 734,"15kg", "2022-05-15","22:35:00","2022-05-15","23:55:00", "airasia58.png", "Wifi,Meal,Plug", "1 hr 30 min"),
(25, "AI-411", "Air India", "PUNE", "ALLAHABAD", 1123,"15kg", "2022-05-15","13:00:00","2022-05-15","14:55:00", "airindia58.png", "Wifi,Meal,Plug", "1 hr 55 min"),
(26, "6E-744", "Spice Jet", "PUNE", "ALLAHABAD", 1123,"15kg", "2022-05-15","06:05:00","2022-05-15","08:00:00", "spice58.png", "Plug", "1 hr 55 min"),
(27, "G8-334", "Go First", "ALLAHABAD", "PUNE",1123,"15kg", "2022-05-15","15:30:00", "2022-05-15","17:25:00", "Go58.png", "Meal,Plug", "1 hr 55 min"),
(28, "AI-868", "Air India", "ALLAHABAD", "PUNE", 1123,"15kg", "2022-05-15","06:00:00", "2022-05-15","07:55:00", "airindia58.png", "Wifi", "1 hr 55 min"),
(29, "Ar1-02", "Vistra", "PUNE", "JAIPUR", 935,"15kg", "2022-05-15","00:45:00", "2022-05-15","02:35:00", "vinset58.png", "Wifi,Meal", "1 hr 50 min"),
(30, "Em-02", "Emariates", "PUNE", "JAIPUR", 935,"15kg", "2022-05-15","14:50:00","2022-05-15","16:35:00", "emirates58.png", "Wifi,Meal,Plug", "1 hr 45 min"),
(31, "Ar2-02", "Indigo-2", "JAIPUR", "PUNE", 935,"15kg", "2022-05-15","07:50:00", "2022-05-15 ","10:05:00", "ind58.png", "Wifi,Meal,Plug", "2 hr 15 min"),
(32, "SG-8157", "SpiceJet", "JAIPUR", "PUNE", 935,"15kg", "2022-05-15","07:30:00", "2022-05-15 ","09:30:00", "spice58.png", "Wifi,Meal,Plug", "2 hr 00 min"),
(33,"Ar1-02", "Indigo", "BANGALORE", "MUMBAI", 842,"15kg","2022-05-15","06:10:00", "2022-05-15","07:45:00","ind58.png","Wifi,Meal,Plug","1 hr 35 min"),
(34,"G8-334", "Go First", "BANGALORE", "MUMBAI", 842,"15kg","2022-05-15","13:00:00", "2022-05-15","14:45:00","Go58.png","Meal,Plug","1 hr 45 min"),
(35,"AI-868", "Air India", "MUMBAI", "BANGALORE", 842,"15kg","2022-05-15","20:00:00", "2022-05-15","21:45:00","airindia58.png","Wifi","1 hr 45 min"),
(36, "Ar1-02", "Vistra", "MUMBAI", "BANGALORE", 842,"15kg", "2022-05-15","06:00:00", "2022-05-15","07:50:00", "vinset58.png", "Wifi,Meal", "1 hr 50 min"),
(37, "Em-02", "Emariates", "MUMBAI", "KOLKATA", 1652,"15kg", "2022-05-15","05:50:00", "2022-05-15","08:30:00", "emirates58.png", "Wifi,Meal,Plug", "02 hr 40 min"),
(38, "Ar2-02", "Indigo-2", "MUMBAI", "KOLKATA", 1652,"15kg", "2022-05-15","21:00:00", "2022-05-15","23:50:00", "ind58.png", "Wifi,Meal,Plug", "02 hr 50 min"),
(39, "SG-8157", "SpiceJet", "KOLKATA", "MUMBAI", 1652,"15kg", "2022-05-15", "09:50:00", "2022-05-15", "12:25:00", "spice58.png", "Wifi,Meal,Plug", "2 hr 25 min"),
(40, "I5-784", "Air Asia", "KOLKATA", "MUMBAI", 1652,"15kg", "2022-05-15","17:20:00","2022-05-15","19:55:00", "airasia58.png", "Wifi,Meal,Plug", "02 hr 35 min");
insert into seat (seat_id, class, flight_id, price_for_booking, price_for_cancel, tax) values 
(1,"ECONOMY",1,8216,3000,300),
(2,"BASIC_ECONOMY",1,9549,3500,350),
(3,"PREMIUM_ECONOMY",1,12931,4000,400),
(4,"BUSINESS",1,15726,6000,1500),
(5,"FIRST",1,20860,6800,1800),
(6,"ECONOMY",2,6450,2050,300),
(7,"BASIC_ECONOMY",2,8235,3500,350),
(8,"PREMIUM_ECONOMY",2,12592,5000,400),
(9,"BUSINESS",2,16765,8000,1500),
(10,"FIRST",2,27061,10000,1900),
(11,"ECONOMY",3,7319,3000,300),
(12,"BASIC_ECONOMY",3,9062,3500,350),
(13,"PREMIUM_ECONOMY",3,12444,4500,400),
(14,"BUSINESS",3,15746,6500,1500),
(15,"FIRST",3,25963,8000,1800),
(16,"ECONOMY",4,8139,3500,300),
(17,"BASIC_ECONOMY",4,9062,3500,400),
(18,"PREMIUM_ECONOMY",4,12444,4000,500),
(19,"BUSINESS",4,17068,5000,800),
(20,"FIRST",4,20735,6200,1000),
(21,"ECONOMY",5,5690,2000,400),
(22,"BASIC_ECONOMY",5,7869,3000,450),
(23,"PREMIUM_ECONOMY",5,13460,3500,500),
(24,"BUSINESS",5,17165,5000,800),
(25,"FIRST",5,23712,7000,1000),
(26,"ECONOMY",6,4578,1800,300),
(27,"BASIC_ECONOMY",6,7620,2000,350),
(28,"PREMIUM_ECONOMY",6,12845,4000,400),
(29,"BUSINESS",6,17960,8000,1200),
(30,"FIRST",6,22489,12000,1500),
(31,"ECONOMY",7,5024,2000,300),
(32,"BASIC_ECONOMY",7,7594,3000,400),
(33,"PREMIUM_ECONOMY",7,13841,5000,700),
(34,"BUSINESS",7,17964,7000,1000),
(35,"FIRST",7,23482,10000,1500),
(36,"ECONOMY",8,5873,350,300),
(37,"BASIC_ECONOMY",8,8549,3500,400),
(38,"PREMIUM_ECONOMY",8,13976,5000,800),
(39,"BUSINESS",8,18647,6500,1200),
(40,"FIRST",8,21452,8000,1500),
(41,"ECONOMY",9,9093,3300,300),
(42,"BASIC_ECONOMY",9,12086,3500,400),
(43,"PREMIUM_ECONOMY",9,15598,5000,600),
(44,"BUSINESS",9,19960,5800,800),
(45,"FIRST",9,24965,7000,1200),
(46,"ECONOMY",10,8964,3000,300),
(47,"BASIC_ECONOMY",10,12756,4000,400),
(48,"PREMIUM_ECONOMY",10,15845,5000,700),
(49,"BUSINESS",10,19864,5600,1100),
(50,"FIRST",10,25432,7500,1400),
(51,"ECONOMY",11,9678,3000,300),
(52,"BASIC_ECONOMY",11,13548,3500,500),
(53,"PREMIUM_ECONOMY",11,15492,4000,800),
(54,"BUSINESS",11,19254,5000,1200),
(55,"FIRST",11,25125,6500,1500),
(56,"ECONOMY",12,9732,3000,300),
(57,"BASIC_ECONOMY",12,13545,3500,500),
(58,"PREMIUM_ECONOMY",12,16852,5000,800),
(59,"BUSINESS",12,20731,6800,1200),
(60,"FIRST",12,26433,7300,1500),
(61,"ECONOMY",13,5417,2500,300),
(62,"BASIC_ECONOMY",13,8568,3000,400),
(63,"PREMIUM_ECONOMY",13,11246,4000,600),
(64,"BUSINESS",13,15918,5500,800),
(65,"FIRST",13,19226,7000,1000),
(66,"ECONOMY",14,5695,2100,300),
(67,"BASIC_ECONOMY",14,8732,3200,500),
(68,"PREMIUM_ECONOMY",14,11263,4600,550),
(69,"BUSINESS",14,15962,5000,700),
(70,"FIRST",14,19652,7500,900),
(71,"ECONOMY",15,5679,2000,300),
(72,"BASIC_ECONOMY",15,7892,3100,450),
(73,"PREMIUM_ECONOMY",15,12567,4500,500),
(74,"BUSINESS",15,15756,5300,750),
(75,"FIRST",15,19542,7600,900),
(76,"ECONOMY",16,5000,2000,300),
(77,"BASIC_ECONOMY",16,5500,2900,400),
(78,"PREMIUM_ECONOMY",16,10000,3500,500),
(79,"BUSINESS",16,25000,4800,800),
(80,"FIRST",16,50000,7500,1000),
(81,"ECONOMY",17,2541,1000,200),
(82,"BASIC_ECONOMY",17,3276,1200,250),
(83,"PREMIUM_ECONOMY",17,5696,1500,300),
(84,"BUSINESS",17,8761,2500,350),
(85,"FIRST",17,10364,3000,500),
(86,"ECONOMY",18,2596,1000,200),
(87,"BASIC_ECONOMY",18,3347,1200,250),
(88,"PREMIUM_ECONOMY",18,5486,1600,300),
(89,"BUSINESS",18,8638,2500,350),
(90,"FIRST",18,11436,3200,500),
(91,"ECONOMY",19,2596,1000,200),
(92,"BASIC_ECONOMY",19,3347,1200,250),
(93,"PREMIUM_ECONOMY",19,5963,1600,300),
(94,"BUSINESS",19,8761,2500,350),
(95,"FIRST",19,10364,3200,500),
(96,"ECONOMY",20,2596,1000,200),
(97,"BASIC_ECONOMY",20,3347,1200,250),
(98,"PREMIUM_ECONOMY",20,5486,1600,300),
(99,"BUSINESS",20,8638,2500,350),
(100,"FIRST",20,11436,3200,500),
(101,"ECONOMY",21,4577,1000,200),
(102,"BASIC_ECONOMY",21,6321,1200,250),
(103,"PREMIUM_ECONOMY",21,9645,1600,300),
(104,"BUSINESS",21,8638,11467,350),
(105,"FIRST",21,14566,3200,500),
(106,"ECONOMY",22,4579,1000,200),
(107,"BASIC_ECONOMY",22,6845,1200,250),
(108,"PREMIUM_ECONOMY",22,9814,1600,300),
(109,"BUSINESS",22,11564,2500,350),
(110,"FIRST",22,14785,3200,500),
(111,"ECONOMY",23,4893,1000,200),
(112,"BASIC_ECONOMY",23,6925,2000,250),
(113,"PREMIUM_ECONOMY",23,9812,2500,300),
(114,"BUSINESS",23,11365,3000,350),
(115,"FIRST",23,14326,4000,500),
(116,"ECONOMY",24,4998,1000,200),
(117,"BASIC_ECONOMY",24,6458,1200,250),
(118,"PREMIUM_ECONOMY",24,9744,1600,300),
(119,"BUSINESS",24,8638,11757,350),
(120,"FIRST",24,11436,4000,500),
(121,"ECONOMY",25,4577,1000,200),
(122,"BASIC_ECONOMY",25,6321,1200,250),
(123,"PREMIUM_ECONOMY",25,9645,1600,300),
(124,"BUSINESS",25,8638,11467,350),
(125,"FIRST",25,14566,3200,500),
(126,"ECONOMY",26,4579,1000,200),
(127,"BASIC_ECONOMY",26,6845,1200,250),
(128,"PREMIUM_ECONOMY",26,9814,1600,300),
(129,"BUSINESS",26,11564,2500,350),
(130,"FIRST",26,14785,3200,500),
(131,"ECONOMY",27,4893,1000,200),
(132,"BASIC_ECONOMY",27,6925,2000,250),
(133,"PREMIUM_ECONOMY",27,9812,2500,300),
(134,"BUSINESS",27,11365,3000,350),
(135,"FIRST",27,14326,4000,500),
(136,"ECONOMY",28,4998,1000,200),
(137,"BASIC_ECONOMY",28,6458,1200,250),
(138,"PREMIUM_ECONOMY",28,9744,1600,300),
(139,"BUSINESS",28,8638,11757,350),
(140,"FIRST",28,11436,4000,500),
(141,"ECONOMY",29,5077,1000,200),
(142,"BASIC_ECONOMY",29,7571,2200,250),
(143,"PREMIUM_ECONOMY",29,9632,3200,300),
(144,"BUSINESS",29,11404,3800,350),
(145,"FIRST",29,14973,4000,500),
(146,"ECONOMY",30,5098,1000,200),
(147,"BASIC_ECONOMY",30,7614,2200,250),
(148,"PREMIUM_ECONOMY",30,9814,3000,300),
(149,"BUSINESS",30,11564,2500,350),
(150,"FIRST",30,14785,4200,500),
(151,"ECONOMY",31,5164,1000,200),
(152,"BASIC_ECONOMY",31,7596,2200,250),
(153,"PREMIUM_ECONOMY",31,9845,3200,300),
(154,"BUSINESS",31,11396,3000,350),
(155,"FIRST",31,14865,4000,500),
(156,"ECONOMY",32,5175,1000,200),
(157,"BASIC_ECONOMY",32,7436,2300,250),
(158,"PREMIUM_ECONOMY",32,9744,3000,300),
(159,"BUSINESS",32,11854,11757,350),
(160,"FIRST",32,14568,4000,500),
(161,"ECONOMY",33,4262,1000,200),
(162,"BASIC_ECONOMY",33,5103,2200,250),
(163,"PREMIUM_ECONOMY",33,7573,3200,300),
(164,"BUSINESS",33,9406,3800,350),
(165,"FIRST",33,11705,4000,500),
(166,"ECONOMY",34,4547,1000,200),
(167,"BASIC_ECONOMY",34,5304,2200,250),
(168,"PREMIUM_ECONOMY",34,7693,3000,300),
(169,"BUSINESS",34,10269,2500,350),
(170,"FIRST",34,12368,4200,500),
(171,"ECONOMY",35,4695,1000,200),
(172,"BASIC_ECONOMY",35,5495,2200,250),
(173,"PREMIUM_ECONOMY",35,7659,3200,300),
(174,"BUSINESS",35,10659,3000,350),
(175,"FIRST",35,12989,4000,500),
(176,"ECONOMY",36,4521,1000,200),
(177,"BASIC_ECONOMY",36,5465,2300,250),
(178,"PREMIUM_ECONOMY",36,7856,3000,300),
(179,"BUSINESS",36,10652,11757,350),
(180,"FIRST",36,12655,4000,500),
(181,"ECONOMY",37,4262,1000,200),
(182,"BASIC_ECONOMY",37,5103,2200,250),
(183,"PREMIUM_ECONOMY",37,7573,3200,300),
(184,"BUSINESS",37,9406,3800,350),
(185,"FIRST",37,11705,4000,500),
(186,"ECONOMY",38,4547,1000,200),
(187,"BASIC_ECONOMY",38,5304,2200,250),
(188,"PREMIUM_ECONOMY",38,7693,3000,300),
(189,"BUSINESS",38,10269,2500,350),
(190,"FIRST",38,12368,4200,500),
(191,"ECONOMY",39,4695,1000,200),
(192,"BASIC_ECONOMY",39,5495,2200,250),
(193,"PREMIUM_ECONOMY",39,7659,3200,300),
(194,"BUSINESS",39,10659,3000,350),
(195,"FIRST",39,12989,4000,500),
(196,"ECONOMY",40,4521,1000,200),
(197,"BASIC_ECONOMY",40,5465,2300,250),
(198,"PREMIUM_ECONOMY",40,7856,3000,300),
(199,"BUSINESS",40,10652,11757,350),
(200,"FIRST",40,12655,4000,500);
insert into seat_status(seat_status_id,total_seats,
available_seats,booked_seats,economy_seats_total,economy_seats_available,economy_seats_booked,basic_economy_seats_total,basic_economy_seats_available,basic_economy_seats_booked,premium_economy_seats_total,
premium_economy_seats_available,premium_economy_seats_booked,business_seats_total,business_seats_available,business_seats_booked,first_seats_total,first_seats_available,first_seats_booked, flight_id) values 
(1,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,1),
(2,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,2),
(3,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,3),
(4,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,4),
(5,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,5),
(6,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,6),
(7,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,7),
(8,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,8),
(9,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,9),
(10,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,10),
(11,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,11),
(12,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,12),
(13,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,13),
(14,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,14),
(15,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,15),
(16,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,16),
(17,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,17),
(18,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,18),
(19,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,19),
(20,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,20),
(21,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,21),
(22,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,22),
(23,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,23),
(24,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,24),
(25,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,25),
(26,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,26),
(27,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,27),
(28,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,28),
(29,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,29),
(30,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,30),
(31,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,31),
(32,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,32),
(33,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,33),
(34,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,34),
(35,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,35),
(36,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,36),
(37,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,37),
(38,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,38),
(39,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,39),
(40,200,200,0,40,40,0,40,40,0,40,40,0,40,40,0,40,40,0,40);
insert into airport(airport_id,country,flight_id,name_of_airport,city) 
values
(1, "India", 1, "PUNE AIRPORT", "PUNE"),
(2, "India", 1, "DELHI AIRPORT", "DELHI"),
(3, "India", 2, "PUNE AIRPORT", "PUNE"),
(4, "India", 2, "DELHI AIRPORT", "DELHI"),
(5, "India",3, "DELHI AIRPORT", "DELHI"),
(6, "India", 3, "PUNE AIRPORT", "PUNE"),
(7, "India",4, "DELHI AIRPORT", "DELHI"),
(8, "India", 4, "PUNE AIRPORT", "PUNE"),
(9, "India", 5, "PUNE AIRPORT", "PUNE"),
(10, "India", 5, "CHENNAI AIRPORT", "CHENNAI"),
(11, "India", 6, "PUNE AIRPORT", "PUNE"),
(12, "India", 6, "CHENNAI AIRPORT", "CHENNAI"),
(13, "India", 7, "CHENNAI AIRPORT", "CHENNAI"),
(14, "India", 7, "PUNE AIRPORT", "PUNE"),
(15, "India", 8, "CHENNAI AIRPORT", "CHENNAI"),
(16, "India", 8, "PUNE AIRPORT", "PUNE"),
(17, "India", 9, "PUNE AIRPORT", "PUNE"),
(18, "India", 9, "KOLKATA AIRPORT", "KOLKATA"),
(19, "India", 10, "PUNE AIRPORT", "PUNE"),
(20, "India", 10, "KOLKATA AIRPORT", "KOLKATA"),
(21, "India", 11, "KOLKATA AIRPORT", "KOLKATA"),
(22, "India", 11, "PUNE AIRPORT", "PUNE"),
(23, "India", 12, "KOLKATA AIRPORT", "KOLKATA"),
(24, "India", 12, "PUNE AIRPORT", "PUNE"),
(25, "India", 13, "PUNE AIRPORT", "PUNE"),
(26, "India", 13, "HYDERABAD AIRPORT", "HYDERABAD"),
(27, "India", 14, "PUNE AIRPORT", "PUNE"),
(28, "India", 14, "HYDERABAD AIRPORT", "HYDERABAD"),
(29, "India", 15, "HYDERABAD AIRPORT", "HYDERABAD"),
(30, "India", 15, "PUNE AIRPORT", "PUNE"),
(31, "India", 16, "HYDERABAD AIRPORT", "HYDERABAD"),
(32, "India", 16, "PUNE AIRPORT", "PUNE"),
(33, "India", 17, "PUNE AIRPORT", "PUNE"),
(34, "India", 17, "MUMBAI AIRPORT", "MUMBAI"),
(35, "India", 18, "PUNE AIRPORT", "PUNE"),
(36, "India", 18, "MUMBAI AIRPORT", "MUMBAI"),
(37, "India", 19, "MUMBAI AIRPORT", "MUMBAI"),
(38, "India", 19, "PUNE AIRPORT", "PUNE"),
(39, "India", 20, "MUMBAI AIRPORT", "MUMBAI"),
(40, "India", 20, "PUNE AIRPORT", "PUNE"),
(41, "India", 21, "PUNE AIRPORT", "PUNE"),
(42, "India", 21, "BANGALORE AIRPORT", "BANGALORE"),
(43, "India", 22, "PUNE AIRPORT", "PUNE"),
(44, "India", 22, "BANGALORE AIRPORT", "BANGALORE"),
(45, "India", 23, "BANGALORE AIRPORT", "BANGALORE"),
(46, "India", 23, "PUNE AIRPORT", "PUNE"),
(47, "India", 24, "BANGALORE AIRPORT", "BANGALORE"),
(48, "India", 24, "PUNE AIRPORT", "PUNE"),
(49, "India", 25, "PUNE AIRPORT", "PUNE"),
(50, "India", 25, "ALLAHABAD AIRPORT", "ALLAHABAD"),
(51, "India", 26, "PUNE AIRPORT", "PUNE"),
(52, "India", 26, "ALLAHABAD AIRPORT", "ALLAHABAD"),
(53, "India", 27, "ALLAHABAD AIRPORT", "ALLAHABAD"),
(54, "India", 27, "PUNE AIRPORT", "PUNE"),
(55, "India", 28, "ALLAHABAD AIRPORT", "ALLAHABAD"),
(56, "India", 28, "PUNE AIRPORT", "PUNE"),
(57, "India", 29, "PUNE AIRPORT", "PUNE"),
(58, "India", 29, "JAIPUR AIRPORT", "JAIPUR"),
(59, "India", 30, "PUNE AIRPORT", "PUNE"),
(60, "India", 30, "JAIPUR AIRPORT", "JAIPUR"),
(61, "India", 31, "JAIPUR AIRPORT", "JAIPUR"),
(62, "India", 31, "PUNE AIRPORT", "PUNE"),
(63, "India", 32, "JAIPUR AIRPORT", "JAIPUR"),
(64, "India", 32, "PUNE AIRPORT", "PUNE"),
(65, "India", 33, "BANGALORE AIRPORT", "BANGALORE"),
(66, "India", 33, "MUMBAI AIRPORT", "MUMBAI"),
(67, "India", 34, "BANGALORE AIRPORT", "BANGALORE"),
(68, "India", 34, "MUMBAI AIRPORT", "MUMBAI"),
(69, "India", 35, "MUMBAI AIRPORT", "MUMBAI"),
(70, "India", 35, "BANGALORE AIRPORT", "BANGALORE"),
(71, "India", 36, "MUMBAI AIRPORT", "MUMBAI"),
(72, "India", 36, "BANGALORE AIRPORT", "BANGALORE"),
(73, "India", 37, "MUMBAI AIRPORT", "MUMBAI"),
(74, "India", 38, "KOLKATA AIRPORT", "KOLKATA"),
(75, "India", 39, "MUMBAI AIRPORT", "MUMBAI"),
(76, "India", 39, "KOLKATA AIRPORT", "KOLKATA"),
(77, "India", 40, "KOLKATA AIRPORT", "KOLKATA"),
(78, "India", 40, "MUMBAI AIRPORT", "MUMBAI"),
(79, "India", 40, "KOLKATA AIRPORT", "KOLKATA"),
(80, "India", 40, "MUMBAI AIRPORT", "MUMBAI");