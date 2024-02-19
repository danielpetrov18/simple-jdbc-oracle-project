import java.sql.Date;
import java.util.Random;

public class Data {

    private final static Random rnd = new Random();
    private final String username = "admin";
    private final String pass = "password";
    private final String database = "Set up a DB server!";

    private String[] pizzeria = new String[] {
            "Pizzeria Riva Favorita", "Pizza Randale", "Pizzeria Madonna", "Pizza Bros", "Momo",
            "Pizzeria La Spiga", "Il Mare", "Hefenbrueder", "Disco Volante", "Bio-Pizzeria Vero",
            "Pizzeria Nerone", "Via Toledo Enopizzeria", "Pizzeria Verdi Wien", "Pizza Mari", "La Pausa"
    };
    private String[] piz_street = new String[] {
            "Favoritenstrasse 4-6", "Kettenbrueckengasse 1", "Flurschuetzstrasse 15", "Zollergasse 2", "Kirchengasse 35",
            "Lerchenfelder Strasse 65", "Zieglergasse 15","Zieglergasse 42", "Gumpendorfer Strasse 98", "Waehringer Guertel 162",
            "Theobaldgasse 13", "Laudongasse 13", "Lange G. 16", "Leopoldsgasse 23A", "Neubaugasse 70"
    };
    private String[] ZIP = new String[] {
            "1040 Wien", "1050 Wien", "1120 Wien", "1070 Wien", "1070 Wien",
            "1070 Wien", "1070 Wien", "1070 Wien", "1060 Wien", "1090 Wien",
            "1060 Wien", "1080 Wien", "1080 Wien", "1020 Wien", "1070 Wien"
    };
    private String[] pizzaName = new String[]{
            "Margherita" ,"Marinara" ,"Quattro Stagioni", "Carbonara" ,"Frutti di Mare", "Quattro Formaggi", "Crudo",
            "Napoletana or Napoli" ,"Pugliese", "Montanara", "Emiliana", "Romana" ,"Fattoria" ,"Schiacciata","Prosciutto or Cardinale",
            "Americana" ,"Prosciutto e Funghi" ,"Braccio di Ferro" ,"Sarda" ,"Tonno" ,"Valtellina","Gorgonzola","Calzone",
            "Pizza al Pesto" ,"Mediterranea" ,"Ortolana" ,"Diavola" ,"Rustica" ,"Contadina" ,"Parmigiana" ,"Capricciosa",
            "Ricotta e Spinaci" ,"Mare e Monti" ,"Padana" ,"Tedesca" ,"Tirolese" ,"Boscaiola" ,"Campagnola" ,"Vegetariana",
            "Fontana" ,"Francescana" ,"Pizza tartufata" ,"Tricolore" ,"Valdostana" ,"Caprese" ,"Fiori di zucca" ,"Bismarck",
            "Funghi" ,"Mimosa", "Bufalina"
    };
    private double[] pizzaPrice =  new double[] {
            5.99, 6.99, 7.99, 8.99, 9.99,
            5.50, 6.50, 7.50, 8.50, 9.50,
            5.89, 6.89, 7.89, 8.89, 9.89,
            10, 10.50, 10.89, 10.99, 12.00,
            12.50, 12.89, 13.99, 15.20, 20.89,
            5.91, 11.12, 12.13, 13.98, 9.98,
            5.50, 6.50, 7.50, 8.50, 9.50,
            10, 10.50, 10.89, 10.99, 12.00,
            10, 10.50, 10.89, 10.99, 12.00,
            5.99, 6.99, 7.99, 8.99, 9.99
    };
    private String surnamesString = "'Miller','Davis','Garcia','Rodriguez','Wilson','Martinez','Anderson','Taylor','Thomas','Hernandez','Moore','Martin','Jackson','Thompson','White','Lopez','Lee','Gonzalez','Harris','Clark','Lewis','Robinson','Walker','Perez','Hall','Young','Allen','Sanchez','Wright','King','Scott','Green','Baker','Adams','Nelson','Hill','Ramirez','Campbell','Mitchell','Roberts','Carter','Phillips','Evans','Turner','Torres','Parker','Collins','Edwards','Stewart','Flores','Morris','Nguyen','Murphy','Rivera','Cook','Rogers','Morgan','Peterson','Cooper','Reed','Bailey','Bell','Gomez','Kelly','Howard','Ward','Cox','Diaz','Richardson','Wood','Watson','Brooks','Bennett','Gray','James','Reyes','Cruz','Hughes','Price','Myers','Long','Foster','Sanders','Ross','Morales','Powell','Sullivan','Russell','Ortiz','Jenkins','Gutierrez','Perry','Butler','Barnes','Fisher','Henderson','Coleman','Simmons','Patterson','Jordan','Reynolds','Hamilton','Graham','Kim','Gonzales','Alexander','Ramos','Wallace','Griffin','West','Cole','Hayes','Chavez','Gibson','Bryant','Ellis','Stevens','Murray','Ford','Marshall','Owens','Mcdonald','Harrison','Ruiz','Kennedy','Wells','Alvarez','Woods','Mendoza','Castillo','Olson','Webb','Washington','Tucker','Freeman','Burns','Henry','Vasquez','Snyder','Simpson','Crawford','Jimenez','Porter','Mason','Shaw','Gordon','Wagner','Hunter','Romero','Hicks','Dixon','Hunt','Palmer','Robertson','Black','Holmes','Stone','Meyer','Boyd','Mills','Warren','Fox','Rose','Rice','Moreno','Schmidt','Patel','Ferguson','Nichols','Herrera','Medina','Ryan','Fernandez','Weaver','Daniels','Stephens','Gardner','Payne','Kelley','Dunn','Pierce','Arnold','Tran','Spencer','Peters','Hawkins','Grant','Hansen','Castro','Hoffman','Hart','Elliott','Cunningham','Knight','Bradley','Carroll','Hudson','Duncan','Armstrong','Berry','Andrews','Johnston','Ray','Lane','Riley','Carpenter','Perkins','Aguilar','Silva','Richards','Willis','Matthews','Chapman','Lawrence','Garza','Vargas','Watkins','Wheeler','Larson','Carlson','Harper','George','Greene','Burke','Guzman','Morrison','Munoz','Jacobs','Obrien','Lawson','Franklin','Lynch','Bishop','Carr','Salazar','Austin','Mendez','Gilbert','Jensen','Williamson','Montgomery','Harvey','Oliver','Howell','Dean','Hanson','Weber','Garrett','Sims','Burton','Fuller','Soto','Mccoy','Welch','Chen','Schultz','Walters','Reid','Fields','Walsh','Little','Fowler','Bowman','Davidson','May','Day','Schneider','Newman','Brewer','Lucas','Holland','Wong','Banks','Santos','Curtis','Pearson','Delgado','Valdez','Pena','Rios','Douglas','Sandoval','Barrett','Hopkins','Keller','Guerrero','Stanley','Bates','Alvarado','Beck','Ortega','Wade','Estrada','Contreras','Barnett','Caldwell','Santiago','Lambert','Powers','Chambers','Nunez','Craig','Leonard','Lowe','Rhodes','Byrd','Gregory','Shelton','Frazier','Becker','Maldonado','Fleming','Vega','Sutton','Cohen','Jennings','Parks','Mcdaniel','Watts','Barker','Norris','Vaughn','Vazquez','Holt','Schwartz','Steele','Benson','Neal','Dominguez','Horton','Terry','Wolfe','Hale','Lyons','Graves','Haynes','Miles','Park','Warner','Padilla','Bush','Thornton','Mccarthy','Mann','Zimmerman','Erickson','Fletcher','Mckinney','Page','Dawson','Joseph','Marquez','Reeves','Klein','Espinoza','Baldwin','Moran','Love','Robbins','Higgins','Ball','Cortez','Le','Griffith','Bowen','Sharp','Cummings','Ramsey','Hardy','Swanson','Barber','Acosta','Luna','Chandler','Blair','Daniel','Cross','Simon','Dennis','Oconnor','Quinn','Gross','Navarro','Moss','Fitzgerald','Doyle','Mclaughlin','Rojas','Rodgers','Stevenson','Singh','Yang','Figueroa','Harmon','Newton','Paul','Manning','Garner','Mcgee','Reese','Francis','Burgess','Adkins','Goodman','Curry','Brady','Christensen','Potter','Walton','Goodwin','Mullins','Molina','Webster','Fischer','Campos','Avila','Sherman','Todd','Chang','Blake','Malone','Wolf','Hodges','Juarez','Gill','Farmer','Hines','Gallagher','Duran','Hubbard','Cannon','Miranda','Wang','Saunders','Tate','Mack','Hammond','Carrillo','Townsend','Wise','Ingram','Barton','Mejia','Ayala','Schroeder','Hampton','Rowe','Parsons','Frank','Waters','Strickland','Osborne','Maxwell','Chan','Deleon','Norman','Harrington','Casey','Patton','Logan','Bowers','Mueller','Glover','Floyd','Hartman','Buchanan','Cobb','French','Kramer','Mccormick','Clarke','Tyler','Gibbs','Moody','Conner','Sparks','Mcguire','Leon','Bauer','Norton','Pope','Flynn','Hogan','Robles','Salinas','Yates','Lindsey','Lloyd','Marsh','Mcbride','Owen','Solis','Pham','Lang','Pratt','Lara','Brock','Ballard','Trujillo','Shaffer','Drake','Roman','Aguirre','Morton','Stokes','Lamb','Pacheco','Patrick','Cochran','Shepherd','Cain','Burnett','Hess','Li','Cervantes','Olsen','Briggs','Ochoa','Cabrera','Velasquez','Montoya','Roth','Meyers','Cardenas','Fuentes','Weiss','Wilkins','Hoover','Nicholson','Underwood','Short','Carson','Morrow','Colon','Holloway','Summers','Bryan','Petersen','Mckenzie','Serrano','Wilcox','Carey','Clayton','Poole','Calderon','Gallegos','Greer','Rivas','Guerra','Decker','Collier','Wall','Whitaker','Bass','Flowers','Davenport','Conley','Houston','Huff','Copeland','Hood','Monroe','Massey','Roberson','Combs','Franco','Larsen','Pittman','Randall','Skinner','Wilkinson','Kirby','Cameron','Bridges','Anthony','Richard','Kirk','Bruce','Singleton','Mathis','Bradford','Boone','Abbott','Charles','Allison','Sweeney','Atkinson','Horn','Jefferson','Rosales','York','Christian','Phelps','Farrell','Castaneda','Nash','Dickerson','Bond','Wyatt','Foley','Chase','Gates','Vincent','Mathews','Hodge','Garrison','Trevino','Villarreal','Heath','Dalton','Valencia','Callahan','Hensley','Atkins','Huffman','Roy','Boyer','Shields','Lin','Hancock','Grimes','Glenn','Cline','Delacruz','Camacho','Dillon','Parrish','Oneill','Melton','Booth','Kane','Berg','Harrell','Pitts','Savage','Wiggins','Brennan','Salas','Marks','Russo','Sawyer','Baxter','Golden','Hutchinson','Liu','Walter','Mcdowell','Wiley','Rich','Humphrey','Johns','Koch','Suarez','Hobbs','Beard','Gilmore','Ibarra','Keith','Macias','Khan','Andrade','Ware','Stephenson','Henson','Wilkerson','Dyer','Mcclure','Blackwell','Mercado','Tanner','Eaton','Clay','Barron','Beasley','Oneal','Small','Preston','Wu','Zamora','Macdonald','Vance','Snow','Mcclain','Stafford','Orozco','Barry','English','Shannon','Kline','Jacobson','Woodard','Huang','Kemp','Mosley','Prince','Merritt','Hurst','Villanueva','Roach','Nolan','Lam','Yoder','Mccullough','Lester','Santana','Valenzuela','Winters','Barrera','Orr','Leach','Berger','Mckee','Strong','Conway','Stein','Whitehead','Bullock','Escobar','Knox','Meadows','Solomon','Velez','Odonnell','Kerr','Stout','Blankenship','Browning','Kent','Lozano','Bartlett','Pruitt','Buck','Barr','Gaines','Durham','Gentry','Mcintyre','Sloan','Rocha','Melendez','Herman','Sexton','Moon','Hendricks','Rangel','Stark','Lowery','Hardin','Hull','Sellers','Ellison','Calhoun','Gillespie','Mora','Knapp','Mccall','Morse','Dorsey','Weeks','Nielsen','Livingston','Leblanc','Mclean','Bradshaw','Glass','Middleton','Buckley','Schaefer','Frost','Howe','House','Mcintosh','Ho','Pennington','Reilly','Hebert','Mcfarland','Hickman','Noble','Spears','Conrad','Arias','Galvan','Velazquez','Huynh','Frederick','Randolph','Cantu','Fitzpatrick','Mahoney','Peck','Villa','Michael','Donovan','Mcconnell','Walls','Boyle','Mayer','Zuniga','Giles','Pineda','Pace','Hurley','Mays','Mcmillan','Crosby','Ayers','Case','Bentley','Shepard','Everett','Pugh','David','Mcmahon','Dunlap','Bender','Hahn','Harding','Acevedo','Raymond','Blackburn','Duffy','Landry','Dougherty','Bautista','Shah','Potts','Arroyo','Valentine','Meza','Gould','Vaughan','Fry','Rush','Avery','Herring','Dodson','Clements','Sampson','Tapia','Bean','Lynn','Crane','Farley','Cisneros','Benton','Ashley','Mckay','Finley','Best','Blevins','Friedman','Moses','Sosa','Blanchard','Huber','Frye','Krueger','Bernard','Rosario','Rubio','Mullen','Benjamin','Haley','Chung','Moyer','Choi','Horne','Yu','Woodward','Ali','Nixon','Hayden','Rivers','Estes','Mccarty','Richmond','Stuart','Maynard','Brandt','Oconnell','Hanna','Sanford','Sheppard','Church','Burch','Levy','Rasmussen','Coffey','Ponce','Faulkner','Donaldson','Schmitt','Novak','Costa','Montes','Booker','Cordova','Waller','Arellano','Maddox','Mata','Bonilla','Stanton','Compton','Kaufman','Dudley','Mcpherson','Beltran','Dickson','Mccann','Villegas','Proctor','Hester','Cantrell','Daugherty','Cherry','Bray','Davila','Rowland','Madden','Levine','Spence','Good','Irwin','Werner','Krause','Petty','Whitney','Baird','Hooper','Pollard','Zavala','Jarvis','Holden','Haas','Hendrix','Mcgrath','Bird','Lucero','Terrell','Riggs','Joyce','Mercer','Rollins','Galloway','Duke','Odom','Andersen','Downs','Hatfield','Benitez','Archer','Huerta','Travis','Mcneil','Hinton','Zhang','Hays','Mayo','Fritz','Branch','Mooney','Ewing','Ritter','Esparza','Frey','Braun','Gay','Riddle','Haney','Kaiser','Holder','Chaney','Mcknight','Gamble','Vang','Cooley','Carney','Cowan','Forbes','Ferrell','Davies','Barajas','Shea','Osborn','Bright','Cuevas','Bolton','Murillo','Lutz','Duarte','Kidd','Key','Cooke'";

    private String lastnameString = "'Jose','Stephen','Andrew','Raymond','Gregory','Joshua','Jerry','Dennis','Walter','Patrick','Peter','Harold','Douglas','Henry','Carl','Arthur','Ryan','Roger','Joe','Juan','Jack','Albert','Jonathan','Justin','Terry','Gerald','Keith','Samuel','Willie','Ralph','Lawrence','Nicholas','Roy','Benjamin','Bruce','Brandon','Adam','Harry','Fred','Wayne','Billy','Steve','Louis','Jeremy','Aaron','Randy','Howard','Eugene','Carlos','Russell','Bobby','Victor','Martin','Ernest','Phillip','Todd','Jesse','Craig','Alan','Shawn','Clarence','Sean','Philip','Chris','Johnny','Earl','Jimmy','Antonio','Danny','Bryan','Tony','Luis','Mike','Stanley','Leonard','Nathan','Dale','Manuel','Rodney','Curtis','Norman','Allen','Marvin','Vincent','Glenn','Jeffery','Travis','Jeff','Chad','Jacob','Lee','Melvin','Alfred','Kyle','Francis','Bradley','Jesus','Herbert','Frederick','Ray','Joel','Edwin','Don','Eddie','Ricky','Troy','Randall','Barry','Alexander','Bernard','Mario','Leroy','Francisco','Marcus','Micheal','Theodore','Clifford','Miguel','Oscar','Jay','Jim','Tom','Calvin','Alex','Jon','Ronnie','Bill','Lloyd','Tommy','Leon','Derek','Warren','Darrell','Jerome','Floyd','Leo','Alvin','Tim','Wesley','Gordon','Dean','Greg','Jorge','Dustin','Pedro','Derrick','Dan','Lewis','Zachary','Corey','Herman','Maurice','Vernon','Roberto','Clyde','Glen','Hector','Shane','Ricardo','Sam','Rick','Lester','Brent','Ramon','Charlie','Tyler','Gilbert','Gene','Marc','Reginald','Ruben','Brett','Angel','Nathaniel','Rafael','Leslie','Edgar','Milton','Raul','Ben','Chester','Cecil','Duane','Franklin','Andre','Elmer','Brad','Gabriel','Ron','Mitchell','Roland','Arnold','Harvey','Jared','Adrian','Karl','Cory','Claude','Erik','Darryl','Jamie','Neil','Jessie','Christian','Javier','Fernando','Clinton','Ted','Mathew','Tyrone','Darren','Lonnie','Lance','Cody','Julio','Kelly','Kurt','Allan','Nelson','Guy','Clayton','Hugh','Max','Dwayne','Dwight','Armando','Felix','Jimmie','Everett','Jordan','Ian','Wallace','Ken','Bob','Jaime','Casey','Alfredo','Alberto','Dave','Ivan','Johnnie','Sidney','Byron','Julian','Isaac','Morris','Clifton','Willard','Daryl','Ross','Virgil','Andy','Marshall','Salvador','Perry','Kirk','Sergio','Marion','Tracy','Seth','Kent','Terrance','Rene','Eduardo','Terrence','Enrique','Freddie','Wade', 'Mary','Patricia','Linda','Barbara','Elizabeth','Jennifer','Maria','Susan','Margaret','Dorothy','Lisa','Nancy','Karen','Betty','Helen','Sandra','Donna','Carol','Ruth','Sharon','Michelle','Laura','Sarah','Kimberly','Deborah','Jessica','Shirley','Cynthia','Angela','Melissa','Brenda','Amy','Anna','Rebecca','Virginia','Kathleen','Pamela','Martha','Debra','Amanda','Stephanie','Carolyn','Christine','Marie','Janet','Catherine','Frances','Ann','Joyce','Diane','Alice','Julie','Heather','Teresa','Doris','Gloria','Evelyn','Jean','Cheryl','Mildred','Katherine','Joan','Ashley','Judith','Rose','Janice','Kelly','Nicole','Judy','Christina','Kathy','Theresa','Beverly','Denise','Tammy','Irene','Jane','Lori','Rachel','Marilyn','Andrea','Kathryn','Louise','Sara','Anne','Jacqueline','Wanda','Bonnie','Julia','Ruby','Lois','Tina','Phyllis','Norma','Paula','Diana','Annie','Lillian','Emily','Robin','Peggy','Crystal','Gladys','Rita','Dawn','Connie','Florence','Tracy','Edna','Rebekah','Lucinda','Dorthy','Chris','Effie','Trina','Reba','Shawn','Sallie','Aurora','Lenora','Etta','Lottie','Kerri','Trisha','Nikki','Estella','Francisca','Josie','Tracie','Marissa','Karin','Brittney','Janelle','Lourdes','Laurel','Helene','Fern','Elva','Corinne','Kelsey','Ina','Bettie','Elisabeth','Aida','Caitlin','Ingrid','Iva','Eugenia','Christa','Goldie','Cassie','Maude','Jenifer','Therese','Frankie','Dena','Lorna','Janette','Latonya','Candy','Morgan','Consuelo','Tamika','Rosetta','Debora','Cherie','Polly','Dina','Jewell','Fay','Jillian','Dorothea','Nell','Trudy','Esperanza','Patrica','Kimberley','Shanna','Helena','Carolina','Cleo','Stefanie','Rosario','Ola','Janine','Mollie','Lupe','Alisa','Lou','Maribel','Susanne','Bette','Susana','Elise','Cecile','Isabelle','Lesley','Jocelyn','Paige','Joni','Rachelle','Leola','Daphne','Alta','Ester','Petra','Graciela','Imogene','Jolene','Keisha','Lacey','Glenna','Gabriela','Keri','Ursula','Lizzie','Kirsten','Shana','Adeline','Mayra','Jayne','Jaclyn','Gracie', 'Janell','Ines','Concetta','Bertie','Alba','Brigitte','Alyson','Vonda','Pansy','Elba','Noelle','Letitia','Kitty','Deann','Brandie','Louella','Leta','Felecia','Sharlene','Lesa','Beverley','Robert','Isabella', 'Abraham', 'Burch','Levy','Rasmussen','Coffey','Ponce','Faulkner','Donaldson','Schmitt','Novak','Costa','Montes','Booker','Cordova','Waller','Arellano','Maddox','Mata','Bonilla','Stanton','Compton','Kaufman','Dudley','Mcpherson','Beltran','Dickson','Mccann','Villegas','Proctor','Hester','Cantrell','Daugherty','Cherry','Bray','Davila','Rowland','Madden','Levine','Spence','Good','Irwin','Werner','Krause','Petty','Whitney','Baird','Hooper','Pollard','Zavala','Jarvis','Holden','Haas','Hendrix','Mcgrath','Bird','Lucero','Terrell','Riggs','Joyce','Mercer','Rollins','Galloway','Duke','Odom','Andersen','Downs','Hatfield','Benitez','Archer','Huerta','Travis','Mcneil','Hinton','Zhang','Hays','Mayo','Fritz','Branch','Mooney','Ewing','Ritter','Esparza','Frey','Braun','Gay','Riddle','Haney','Kaiser','Holder','Chaney','Mcknight','Gamble','Vang','Cooley','Carney','Cowan','Forbes','Ferrell','Davies','Barajas','Shea','Osborn','Bright','Cuevas','Bolton','Murillo','Lutz','Duarte','Kidd','Key','Cooke', 'Mary','Patricia','Linda','Barbara','Elizabeth','Jennifer','Maria','Susan','Margaret','Dorothy','Lisa','Nancy','Karen','Betty','Helen','Sandra','Donna','Carol','Ruth','Sharon','Michelle','Laura','Sarah','Kimberly','Deborah','Jessica','Shirley','Cynthia','Angela','Melissa','Brenda','Amy','Anna','Rebecca','Virginia','Kathleen','Pamela','Martha','Debra','Amanda','Stephanie','Carolyn','Christine','Marie','Janet','Catherine','Frances','Ann','Joyce','Diane','Alice','Julie','Heather','Teresa','Doris','Gloria','Evelyn','Jean','Cheryl','Mildred','Katherine','Joan','Ashley','Judith','Rose','Janice','Kelly','Nicole','Judy','Christina','Kathy','Theresa','Beverly','Denise','Tammy','Irene','Jane','Lori','Rachel','Marilyn','Andrea','Kathryn','Louise','Sara','Anne','Jacqueline','Wanda','Bonnie','Julia','Ruby','Lois','Tina','Phyllis','Norma','Paula','Diana','Annie','Lillian','Emily','Robin','Peggy','Crystal','Gladys','Rita','Dawn','Connie','Florence','Tracy','Edna','Tiffany','Carmen','Rosa','Cindy','Grace','Wendy','Victoria','Edith','Kim','Sherry','Sylvia','Josephine','Thelma','Shannon','Sheila','Ethel','Ellen','Elaine','Marjorie','Carrie','Charlotte','Monica','Esther','Pauline','Emma','Juanita','Anita','Rhonda','Hazel','Amber','Eva','Debbie','April','Leslie','Clara','Lucille','Jamie','Joanne','Eleanor','Valerie','Danielle','Megan','Alicia','Suzanne','Michele','Gail','Bertha','Darlene','Veronica','Jill','Erin','Geraldine','Lauren','Cathy','Joann','Lorraine','Lynn','Sally','Regina','Erica','Beatrice','Dolores','Bernice','Audrey','Yvonne','Annette','June','Samantha','Marion','Dana','Stacy','Ana','Renee','Ida','Vivian','Roberta','Holly','Brittany','Melanie','Loretta','Yolanda','Jeanette','Laurie','Katie','Kristen','Vanessa','Alma','Sue','Elsie','Beth','Jeanne','Vicki','Carla','Tara','Rosemary','Eileen','Terri','Gertrude','Lucy','Tonya','Ella','Stacey','Wilma','Gina','Kristin','Jessie','Natalie','Agnes','Vera','Willie','Charlene','Bessie','Delores','Melinda','Pearl','Arlene','Maureen','Colleen','Allison','Tamara','Joy','Georgia','Constance','Lillie','Claudia','Jackie','Marcia','Tanya','Nellie','Minnie','Marlene','Heidi','Glenda','Lydia','Viola','Courtney','Marian','Stella','Caroline','Dora','Jo','Vickie','Mattie','Terry','Maxine','Irma','Mabel','Marsha','Myrtle','Lena','Christy','Deanna','Patsy','Hilda','Gwendolyn','Jennie','Nora','Margie','Nina','Cassandra','Leah','Penny','Kay','Priscilla','Naomi','Carole','Brandy','Olga','Billie','Dianne','Tracey','Leona','Jenny','Felicia','Sonia','Miriam','Velma','Becky','Bobbie','Violet','Kristina','Toni','Misty','Mae','Shelly','Daisy','Ramona','Sherri','Erika','Katrina','Claire','Lindsey','Lindsay','Geneva','Guadalupe','Belinda','Margarita','Sheryl','Cora','Faye','Ada','Natasha','Sabrina','Isabel','Marguerite','Hattie','Harriet','Molly','Cecilia','Kristi','Brandi','Blanche','Sandy','Rosie','Joanna','Iris','Eunice','Angie','Inez','Lynda','Madeline','Amelia','Alberta','Genevieve','Monique','Jodi','Janie','Maggie','Kayla','Sonya','Jan','Lee','Kristine','Candace','Fannie','Maryann','Opal','Alison','Yvette','Melody','Luz','Susie','Olivia','Flora','Shelley','Kristy','Mamie','Lula','Lola','Verna','Beulah','Antoinette','Candice','Juana','Jeannette','Pam','Kelli','Hannah','Whitney', 'Petrova', 'Ivanova'";
    
    private String[] surnames = surnamesString.replace(',', ' ').replace('\'', ' ').trim().replaceAll(" +", " ").split(" ");
    private String[] lastnames = lastnameString.replace(',', ' ').replace('\'', ' ').replace('\"', ' ').trim().replaceAll(" +", " ").split(" ");

    private String[] ingredients = new String[] { "Tomatoes", "Cheese", "Olives", "Pickles", "Ham", "Salami",
        "Pineapple", "Mushrooms", "Tomato Sauce", "Corn", "Peppers", "Mozzarella Cheese", "Onion", "Oregano", 
        "Parmesan Cheese", "Basil", "Pepperoni", "Jalapeno", "Arugula", "Prosciutto"
    };

    // getters
    public String getUsername() { return this.username; }
    public String getPass() { return this.pass; }
    public String getDatabase() { return this.database; }
    public String[] getPizzeria() { return this.pizzeria; }
    public String[] getPizzaStreet() { return this.piz_street; }
    public String[] getZIP() { return this.ZIP; }
    public String[] getPizzaName() { return this.pizzaName; }
    public double[] getPizzaPrice() { return this.pizzaPrice; }
    public String[] getSurnames() { return this.surnames; }
    public String[] getLastnames() { return this.lastnames; }

    // generator methods
    public String generatePhone() {
        return "" + (rnd.nextInt(7) + 1) * 100 + (rnd.nextInt(8) * 10) + rnd.nextInt(8) + "-" + rnd.nextInt(743) + "-" + rnd.nextInt(10000);
    }
    public String generateSalary() {
        String salary = String.format("%04d", rnd.nextInt(10000));
        if(salary.charAt(0) == '0') {
            salary = salary.replace("0", "3");
        }
        return salary;
    }
    public java.sql.Date generateDate() {
        // random.nextInt(max - min + 1) + min
        int minMonth = 1, maxMonth = 12,  minDay = 1, maxDay = 31;
        long year = 2022;
        long month = rnd.nextInt(maxMonth - minMonth + 1) + minMonth;
        long day = rnd.nextInt(maxDay - minDay + 1) + minDay;

        return Date.valueOf("" + year + "-" + month + "-" + day);
    }
    public String generatePizzaName() {
        // random.nextInt(max - min + 1) + min
        // min pizza 0 and max pizza index is 49
        return this.pizzaName[rnd.nextInt(49 + 1)];
    }
    public int generatePizzaCount() {
        // 4 max pizza count and 1 min pizza count
        return rnd.nextInt(4 - 1 + 1) + 1;
    }

    public int generateIngredientNr() {
        // 20 ingredients max
        return rnd.nextInt(19 + 1);
    }

    public String getIngredient(int idx) {
        return ingredients[idx];
    }

    public String[] getIngredients() {
        return ingredients;
    }

    // default ctor
    public Data() {}

}