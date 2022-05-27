package com.saturnus.mapsku;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.saturnus.mapsku.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Lokasi Saat Ini and move the camera
        LatLng Lsay = new LatLng(-6.234452, 106.695537);
        mMap.addMarker(new MarkerOptions().position(Lsay).title("Pasar Lembang, Ciledug"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lsay));

        // Add a marker in Rumah and move the camera
        LatLng rumah = new LatLng(-6.241177, 106.744806);
        mMap.addMarker(new MarkerOptions().position(rumah).title("Lokasi Rumah, Kreo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumah));

        // Add a marker in Kampus and move the camera
        LatLng unpam = new LatLng(-6.346453, 106.744806);
        mMap.addMarker(new MarkerOptions().position(unpam).title("Universitas Pamulang, Viktor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(unpam));
    }
}