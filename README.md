# hotel-crud-opration
Steps to create project---

create project using spring initializr(url=start.spring.io),

select maven,

select spring boot version,

select java version,

project metadata(
    group(com.sunglowsys)
    artifact(hotel-crud-opreation)
    package name(com.sunglowsys)
  ),
  
 select packaging(jar),
 
add dependency(spring web, spring data jpa, mysql driver),

Generate jar file,

Extract the generated file,

open intelliJ IDEA(or any IDEA),

load the project ,

create packages(
   domain,
   repository,
   service,
   rest
 ),
 
 inside domain package create Hotel domain class and use @Entity annotation on this class,
 
 in Hotel class define all the required properties of Hotel,
 
 inside repository package create HotelRepository interface extending JpaRepository and use @Repository annotation on this interface ,
 
 inside service package create HotelService interface,
 
 in HotelService interface create method(
    save();
    update();
    findAll();
    findById();
    delete();
  ),
  
  inside service package create HotelServiceImpl class implements HotelService and use @Service annotation on this class,
  
  in HotelServiceImpl class implements all the methods of HotelService interface,
  
  Inside rest HotelResource class and use @RestController annotation on this class,
  
  in this class create all the endPoints(methods)-
      
      @PostMapping()
      createHotel(){}
      
      @PutMapping()
      udateHotel(){}
      
      @GetMapping()
      getAllHotels(){}
      
      @GetMapping()
      getHotel(){}
      
      @DeleteMapping()
      deleteHotel(){}
