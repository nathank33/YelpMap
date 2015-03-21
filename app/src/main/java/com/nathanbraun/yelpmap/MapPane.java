//package com.nathanbraun.yelpmap;
//
//import android.app.Activity;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.MapFragment;
//import com.google.android.gms.maps.OnMapReadyCallback;
//
//public class MapPane extends MapFragment implements OnMapReadyCallback {
//    private MapManeInteractionListener mListener;
//
//    public static MapPane newInstance() {
//        MapPane fragment = new MapPane();
//        return fragment;
//    }
//
//    public MapPane() {
//        // Required empty public constructor
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_map_pane, container, false);
//    }
//
//
//    @Override
//    public void onMapReady(GoogleMap map) {
//     /*    LatLng sydney = new LatLng(-33.867, 151.206);
//
//        map.setMyLocationEnabled(true);
//        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
//
//        map.addMarker(new MarkerOptions()
//                .title("Sydney")
//                .snippet("The most populous city in Australia.")
//                .position(sydney));
//    */
//    }
//
//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        try {
//            mListener = (MapManeInteractionListener) activity;
//        } catch (ClassCastException e) {
//            //throw new ClassCastException(activity.toString()
//            //        + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    public interface MapManeInteractionListener {
//        public void onFragmentInteraction(Uri uri);
//    }
//
//}
