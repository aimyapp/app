CREATE TABLE userhi (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) NOT NULL DEFAULT '',
  `user_email` varchar(255) NOT NULL DEFAULT '',
  `del_flg` tinyint(1) unsigned NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_id`)
) DEFAULT CHARSET=utf8mb4;

INSERT INTO userhi (user_id, user_name, user_email, del_flg)
VALUES
(1, 'Taro Yamada', 'taro.yamada@example.com', 0),
(2, 'Hanako Sato', 'hanako.sato@example.com', 0),
(3, 'Ichiro Suzuki', 'ichiro.suzuki@example.com', 0),
(4, 'Jiro Takahashi', 'jiro.takahashi@example.com', 0),
(5, 'Misaki Tanaka', 'misaki.tanaka@example.com', 0);