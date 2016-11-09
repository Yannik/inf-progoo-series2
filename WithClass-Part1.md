With Class
===================
![](http://yuml.me/da22b7e3.png)

Created using http://yuml.me/diagram/scruffy/class/draw:
```
[Vehicles|-velocity:double;-seats:int|+getMaximumVelocity():double;+setMaximumVelocity(velocity:double);+getSeats():int;+setSeats(seats:int)]<-[WaterVehicles]
[WaterVehicles|-requiredWaterDepth|+setRequiredDepth(meters:double);+getRequiredDepth():double]<-[SteamShip|-hp|+setHP():double;+getHP():double]
[WaterVehicles]<-[RowingBoat]
[Vehicles]<-[LandVehicles]
[LandVehicles|wheels:int|+getWheels():int;+setWheels(wheels:int):int]<-[MusclePowered]
[MusclePowered]<-[Bicycle]
[LandVehicles]<-[EnginePowered|-hp|+setHP():double;+getHP():double]
[EnginePowered]<-[Car]
```

All vehicles are of type "Vehicle". Therefore, they all posess the velocity attribute and getters/setters. Additionally, as all vehicles can only transport a certain number of people (and, depending on vehicle type, this drastically alters the maximum velocity), the Vehicles class also posesses an attribute "seats" and appropriate getters and setters.
The Vehicle's are split into two subclasses, LandVehicles and WaterVehicles, as they contain differing attributes: wheels for LandVehicles, and the water depth for WaterVehicles. The required actual vehicles are then sorted into these classes, with the exception that LandVehicles are additionally divided into EnginePowered and MusclePowered vehicles, and all EnginePowered Vehicles possess an attribute specifying the horsepowers of the vehicle. I did not choose to do this for WaterVehicles, as horsepower seemed less relevant to the speed in comparison to other things like shape of the hull, weight, etc. However, as required, the steam ship also has an horsepower attribute.

