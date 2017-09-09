val url = "https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=Sargodha&destinations=Faisalabad&key=AIzaSyC-yKwndvM-el8hAo1PRijFFT99nuc-HUw"
val result = scala.io.Source.fromURL(url).mkString
println(result)
