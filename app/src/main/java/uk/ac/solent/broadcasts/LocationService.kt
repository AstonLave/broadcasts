package uk.ac.solent.broadcasts;

import android.app.Service
import android.content.ContentProvider
import android.content.Context
import android.content.Intent
import android.os.Binder
import android.os.IBinder

import android.location.LocationManager;
import android.location.LocationListener;
import android.location.Location;
import android.os.Bundle
import android.widget.Toast

class LocationService: Service(), LocationListener{
    var mv: MapView? = null


        inner class  LocationServiceBinder : Binder(){
            fun getService() : LocationService
            {
            return this@LocationService
            }
        }

        override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int{

             val mgr =  getSystemService(Context.LOCATION_SERVICE) as LocationManager

            mgr.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0.0f, this);




        }
        // Set up your location manager and location listener
        override fun onLocationChanged(Location: location) {
            
        }

        override fun  onProviderDisabled(provider: String) {

        }

         override fun  onProviderEnabled( provider: String) {
         }

            override fun  onStatusChanged( provider: String, status: Int, extras: Bundle) {

        }
}
