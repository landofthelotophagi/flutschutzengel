package com.example.hackzurich2021demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;
import com.esri.arcgisruntime.data.ServiceFeatureTable;
import com.esri.arcgisruntime.layers.FeatureLayer;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.ArcGISScene;
import com.esri.arcgisruntime.mapping.ArcGISTiledElevationSource;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.BasemapStyle;
import com.esri.arcgisruntime.mapping.ElevationSource;
import com.esri.arcgisruntime.mapping.Surface;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.Camera;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.esri.arcgisruntime.mapping.view.SceneView;

import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.geometry.PointCollection;
import com.esri.arcgisruntime.geometry.Polygon;
import com.esri.arcgisruntime.geometry.Polyline;
import com.esri.arcgisruntime.geometry.SpatialReferences;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.Graphic;
import com.esri.arcgisruntime.mapping.view.GraphicsOverlay;
import com.esri.arcgisruntime.symbology.SimpleFillSymbol;
import com.esri.arcgisruntime.symbology.SimpleLineSymbol;
import com.esri.arcgisruntime.symbology.SimpleMarkerSymbol;

public class MainActivity extends AppCompatActivity {

    private MapView hz2021MapView;
    private ArcGISMap hz2021Map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMap();
    }

    @Override
    protected void onPause(){
        hz2021MapView.pause();
        super.onPause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        hz2021MapView.resume();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        hz2021MapView.dispose();
    }

    private void setupMap() {

        ArcGISRuntimeEnvironment.setApiKey("AAPK6e70f2b3e075441bb629b12b62345c98bJhIHSKIQr60Qs55jwj9Xp1E-Vo8ciOhlQMUi8ShQKFxvvLVfEa0xhJBmyKc6ng6");

        hz2021MapView = findViewById(R.id.hz2021MapView);

        hz2021Map = new ArcGISMap(Basemap.Type.TOPOGRAPHIC, 47.356, 8.541, 13); //47.356, 8.541,13);

        hz2021MapView.setMap(hz2021Map);

        GraphicsOverlay graphicsOverlay = new GraphicsOverlay();
        hz2021MapView.getGraphicsOverlays().add(graphicsOverlay);

        //region POLYGON1

        // create a point collection with a spatial reference, and add five points to it
        PointCollection polygonPoints = new PointCollection(SpatialReferences.getWgs84());
        polygonPoints.add(new Point(8.531020,47.388154));
        polygonPoints.add(new Point(8.534437,47.386254));
        polygonPoints.add(new Point(8.536336,47.385004));
        polygonPoints.add(new Point(8.536433,47.385055));
        polygonPoints.add(new Point(8.538085,47.384300));
        polygonPoints.add(new Point(8.538665,47.383900));
        polygonPoints.add(new Point(8.539169,47.383459));
        polygonPoints.add(new Point(8.539094,47.383292));
        polygonPoints.add(new Point(8.540035,47.382869));
        polygonPoints.add(new Point(8.541867,47.379927));
        polygonPoints.add(new Point(8.539119,47.379035));
        polygonPoints.add(new Point(8.532559,47.378012));
        polygonPoints.add(new Point(8.530018,47.379523));
        polygonPoints.add(new Point(8.507846,47.395345));
        polygonPoints.add(new Point(8.514949,47.394415));
        polygonPoints.add(new Point(8.522459,47.392294));
        polygonPoints.add(new Point(8.526192,47.390900));

        // create a polygon geometry from the point collection
        Polygon polygon = new Polygon(polygonPoints);

        SimpleLineSymbol outlineSymbol =
                new SimpleLineSymbol(SimpleLineSymbol.Style.SOLID, 0x9921ADA8, 1);

        SimpleFillSymbol polygonFillSymbol =
                new SimpleFillSymbol(SimpleFillSymbol.Style.SOLID,0x9921ADA8, outlineSymbol);

        Graphic polygonGraphic = new Graphic(polygon, polygonFillSymbol);

        // add the polygon graphic to the graphics overlay
        graphicsOverlay.getGraphics().add(polygonGraphic);

        //endregion

        //region POLYGON2

        // create a point collection with a spatial reference, and add five points to it
        polygonPoints = new PointCollection(SpatialReferences.getWgs84());
        polygonPoints.add(new Point(8.538569, 47.379377));
        polygonPoints.add(new Point(8.539927, 47.378869 ));
        polygonPoints.add(new Point(8.539711, 47.378628 ));
        polygonPoints.add(new Point(8.541191, 47.378255 ));
        polygonPoints.add(new Point(8.541137 , 47.377940 ));
        polygonPoints.add(new Point(8.541331 , 47.377875 ));
        polygonPoints.add(new Point(8.541039 , 47.377275 ));
        polygonPoints.add(new Point(8.542120 , 47.377150 ));
        polygonPoints.add(new Point(8.542357 , 47.376763 ));
        polygonPoints.add(new Point(8.542390 , 47.376199 ));
        polygonPoints.add(new Point(8.542022 , 47.375460 ));
        polygonPoints.add(new Point(8.541968 , 47.375387 ));
        polygonPoints.add(new Point(8.541850 , 47.374612 ));
        polygonPoints.add(new Point(8.541914 , 47.374518));
        polygonPoints.add(new Point(8.541914 , 47.374321));
        polygonPoints.add(new Point(8.541526 , 47.374262));
        polygonPoints.add(new Point(8.541390 , 47.374010));
        polygonPoints.add(new Point(8.541515 , 47.373834));
        polygonPoints.add(new Point(8.541466 , 47.373337));
        polygonPoints.add(new Point(8.541366 , 47.373289));
        polygonPoints.add(new Point(8.541598 , 47.373169));
        polygonPoints.add(new Point(8.541725 , 47.373020));
        polygonPoints.add(new Point(8.541763 , 47.372653));
        polygonPoints.add(new Point(8.541407 , 47.372296));
        polygonPoints.add(new Point(8.541804 , 47.372225));
        polygonPoints.add(new Point(8.541855 , 47.371336));
        polygonPoints.add(new Point(8.541598 , 47.371292));
        polygonPoints.add(new Point(8.541542 , 47.371032));
        polygonPoints.add(new Point(8.541250 , 47.370571));
        polygonPoints.add(new Point(8.541269 , 47.370313));
        polygonPoints.add(new Point(8.541201 , 47.370236));
        polygonPoints.add(new Point(8.541436 , 47.36998));
        polygonPoints.add(new Point(8.542029 , 47.369921));
        polygonPoints.add(new Point(8.541962 , 47.369334));
        polygonPoints.add(new Point(8.542010 , 47.369275));
        polygonPoints.add(new Point(8.542000 , 47.369234));
        polygonPoints.add(new Point(8.541960 , 47.369075));
        polygonPoints.add(new Point(8.541825 , 47.367515));
        polygonPoints.add(new Point(8.541977 , 47.366958));
        polygonPoints.add(new Point(8.542187 , 47.366849));
        polygonPoints.add(new Point(8.542298 , 47.366616));
        polygonPoints.add(new Point(8.542128 , 47.366488));
        polygonPoints.add(new Point(8.542136 , 47.366397));
        polygonPoints.add(new Point(8.544386 , 47.366533));
        polygonPoints.add(new Point(8.544343 , 47.366624));
        polygonPoints.add(new Point(8.544186 , 47.36683));
        polygonPoints.add(new Point(8.543983 , 47.366914));
        polygonPoints.add(new Point(8.543932 , 47.367163));
        polygonPoints.add(new Point(8.544078 , 47.367326));
        polygonPoints.add(new Point(8.544118 , 47.367449));
        polygonPoints.add(new Point(8.544043 , 47.367593));
        polygonPoints.add(new Point(8.544745 , 47.367774));
        polygonPoints.add(new Point(8.544848 , 47.367692));
        polygonPoints.add(new Point(8.545149 , 47.367937));
        polygonPoints.add(new Point(8.545384 , 47.368025));
        polygonPoints.add(new Point(8.545133 , 47.368233));
        polygonPoints.add(new Point(8.544873 , 47.368398));
        polygonPoints.add(new Point(8.544164 , 47.369107));
        polygonPoints.add(new Point(8.543883 , 47.369304));
        polygonPoints.add(new Point(8.543621 , 47.369668));
        polygonPoints.add(new Point(8.543555 , 47.369752));
        polygonPoints.add(new Point(8.543380 , 47.369682));
        polygonPoints.add(new Point(8.543398 , 47.369555));
        polygonPoints.add(new Point(8.543380 , 47.369490));
        polygonPoints.add(new Point(8.543224 , 47.369443));
        polygonPoints.add(new Point(8.543195 , 47.369442));
        polygonPoints.add(new Point(8.542962 , 47.369944));
        polygonPoints.add(new Point(8.542966 , 47.370021));
        polygonPoints.add(new Point(8.543028 , 47.370071));
        polygonPoints.add(new Point(8.543059 , 47.370138));
        polygonPoints.add(new Point(8.542882 , 47.371362));
        polygonPoints.add(new Point(8.542601 , 47.371348));
        polygonPoints.add(new Point(8.542513 , 47.371622));
        polygonPoints.add(new Point(8.542530 , 47.372308));
        polygonPoints.add(new Point(8.543094 , 47.372325));
        polygonPoints.add(new Point(8.543218 , 47.372525));
        polygonPoints.add(new Point(8.543058 , 47.372803));
        polygonPoints.add(new Point(8.543144 , 47.372856));
        polygonPoints.add(new Point(8.543324 , 47.373194));
        polygonPoints.add(new Point(8.543353 , 47.373563));
        polygonPoints.add(new Point(8.543520 , 47.374096));
        polygonPoints.add(new Point(8.543617 , 47.374279));
        polygonPoints.add(new Point(8.544165 , 47.375546));
        polygonPoints.add(new Point(8.544168 , 47.375985));
        polygonPoints.add(new Point(8.543996 , 47.376261));
        polygonPoints.add(new Point(8.543420 , 47.376256));
        polygonPoints.add(new Point(8.543393 , 47.376514));
        polygonPoints.add(new Point(8.543310 , 47.376645));
        polygonPoints.add(new Point(8.543304 , 47.376639));
        polygonPoints.add(new Point(8.543277 , 47.377075));
        polygonPoints.add(new Point(8.542636 , 47.378381));
        polygonPoints.add(new Point(8.542556 , 47.378415));
        polygonPoints.add(new Point(8.541923 , 47.379913));
        polygonPoints.add(new Point(8.541660 , 47.380305));
        polygonPoints.add(new Point(8.540882 , 47.379826));

        // create a polygon geometry from the point collection
        polygon = new Polygon(polygonPoints);

        polygonGraphic = new Graphic(polygon, polygonFillSymbol);

        // add the polygon graphic to the graphics overlay
        graphicsOverlay.getGraphics().add(polygonGraphic);

        //endregion

        //region POLYGON3

        // create a point collection with a spatial reference, and add five points to it
        polygonPoints = new PointCollection(SpatialReferences.getWgs84());


        polygonPoints.add(new Point(8.536660 , 47.378029));
        polygonPoints.add(new Point(8.536524 , 47.377720));
        polygonPoints.add(new Point(8.536215 , 47.377351));
        polygonPoints.add(new Point(8.535899 , 47.377050));
        polygonPoints.add(new Point(8.535783 , 47.376977));
        polygonPoints.add(new Point(8.535223 , 47.376505));
        polygonPoints.add(new Point(8.533938 , 47.375598));
        polygonPoints.add(new Point(8.533538 , 47.375237));
        polygonPoints.add(new Point(8.533098 , 47.374821));
        polygonPoints.add(new Point(8.532750 , 47.374419));
        polygonPoints.add(new Point(8.532339 , 47.373820));
        polygonPoints.add(new Point(8.531830 , 47.372950));
        polygonPoints.add(new Point(8.531771 , 47.372915));
        polygonPoints.add(new Point(8.530988 , 47.371608));
        polygonPoints.add(new Point(8.530848 , 47.371330));
        polygonPoints.add(new Point(8.532286 , 47.370819));
        polygonPoints.add(new Point(8.534185 , 47.370213));
        polygonPoints.add(new Point(8.534418 , 47.370078));
        polygonPoints.add(new Point(8.534606 , 47.369927));
        polygonPoints.add(new Point(8.534971 , 47.369282));
        polygonPoints.add(new Point(8.535193 , 47.368966));
        polygonPoints.add(new Point(8.536905 , 47.368768));
        polygonPoints.add(new Point(8.537055 , 47.368730));
        polygonPoints.add(new Point(8.537242 , 47.368654));
        polygonPoints.add(new Point(8.537350 , 47.368561));
        polygonPoints.add(new Point(8.537505 , 47.368407));
        polygonPoints.add(new Point(8.538103 , 47.367713));
        polygonPoints.add(new Point(8.538165 , 47.367722));
        polygonPoints.add(new Point(8.538551 , 47.367295));
        polygonPoints.add(new Point(8.539013 , 47.366785));
        polygonPoints.add(new Point(8.539702 , 47.366067));
        polygonPoints.add(new Point(8.539788 , 47.365929));
        polygonPoints.add(new Point(8.539748 , 47.365782));
        polygonPoints.add(new Point(8.536816 , 47.364727));
        polygonPoints.add(new Point(8.535866 , 47.365717));
        polygonPoints.add(new Point(8.534375 , 47.36519));
        polygonPoints.add(new Point(8.534225 , 47.364439));
        polygonPoints.add(new Point(8.533989 , 47.364162));
        polygonPoints.add(new Point(8.533736 , 47.363327));
        polygonPoints.add(new Point(8.534187 , 47.361397));
        polygonPoints.add(new Point(8.536016 , 47.361379));
        polygonPoints.add(new Point(8.548891 , 47.357609));
        polygonPoints.add(new Point(8.549320 , 47.359789));
        polygonPoints.add(new Point(8.549932 , 47.363376));
        polygonPoints.add(new Point(8.548784 , 47.364526));
        polygonPoints.add(new Point(8.546557 , 47.364402));
        polygonPoints.add(new Point(8.545839 , 47.365163));
        polygonPoints.add(new Point(8.545924 , 47.365454));
        polygonPoints.add(new Point(8.545120 , 47.366617));
        polygonPoints.add(new Point(8.544422 , 47.366500));
        polygonPoints.add(new Point(8.544079 , 47.366915));
        polygonPoints.add(new Point(8.542395 , 47.366602));
        polygonPoints.add(new Point(8.542223 , 47.366513));
        polygonPoints.add(new Point(8.542244 , 47.366353));
        polygonPoints.add(new Point(8.541794 , 47.366277));
        polygonPoints.add(new Point(8.541568 , 47.366248));
        polygonPoints.add(new Point(8.541579 , 47.366128));
        polygonPoints.add(new Point(8.541429 , 47.366077));
        polygonPoints.add(new Point(8.541284 , 47.365983));
        polygonPoints.add(new Point(8.541000 , 47.366005));
        polygonPoints.add(new Point(8.540796 , 47.365997));
        polygonPoints.add(new Point(8.540603 , 47.366346));
        polygonPoints.add(new Point(8.540458 , 47.366350));
        polygonPoints.add(new Point(8.540372 , 47.366266));
        polygonPoints.add(new Point(8.539991 , 47.366081));
        polygonPoints.add(new Point(8.536930 , 47.369289));
        polygonPoints.add(new Point(8.536704 , 47.369049));
        polygonPoints.add(new Point(8.535484 , 47.369163));
        polygonPoints.add(new Point(8.534733 , 47.370162));
        polygonPoints.add(new Point(8.534438 , 47.370342));
        polygonPoints.add(new Point(8.534378 , 47.370377));
        polygonPoints.add(new Point(8.532672 , 47.370841));
        polygonPoints.add(new Point(8.532570 , 47.370854));
        polygonPoints.add(new Point(8.532540 , 47.370915));
        polygonPoints.add(new Point(8.532571 , 47.370970));
        polygonPoints.add(new Point(8.533514 , 47.371860));
        polygonPoints.add(new Point(8.533541 , 47.371896));
        polygonPoints.add(new Point(8.533661 , 47.371885));
        polygonPoints.add(new Point(8.533562 , 47.371943));
        polygonPoints.add(new Point(8.533766 , 47.372330));
        polygonPoints.add(new Point(8.533745 , 47.373675));
        polygonPoints.add(new Point(8.534160 , 47.373865));
        polygonPoints.add(new Point(8.534245 , 47.373864));
        polygonPoints.add(new Point(8.534902 , 47.374143));
        polygonPoints.add(new Point(8.535235 , 47.374368));
        polygonPoints.add(new Point(8.535530 , 47.374777));
        polygonPoints.add(new Point(8.535921 , 47.375641));
        polygonPoints.add(new Point(8.536122 , 47.376219));
        polygonPoints.add(new Point(8.536235 , 47.376275));
        polygonPoints.add(new Point(8.536474 , 47.376648));
        polygonPoints.add(new Point(8.536651 , 47.376867));
        polygonPoints.add(new Point(8.537512 , 47.377734));
        polygonPoints.add(new Point(8.537552 , 47.377900));

        // create a polygon geometry from the point collection
        polygon = new Polygon(polygonPoints);

        polygonGraphic = new Graphic(polygon, polygonFillSymbol);

        // add the polygon graphic to the graphics overlay
        graphicsOverlay.getGraphics().add(polygonGraphic);

        //endregion

        //region POLYLINE1
        // create a point collection with a spatial reference, and add three points to it
        PointCollection polylinePoints = new PointCollection(SpatialReferences.getWgs84());
        polylinePoints.add(new Point( 8.507604, 47.395413));
        polylinePoints.add(new Point( 8.530018, 47.379523));

        // create a polyline geometry from the point collection
        Polyline polyline = new Polyline(polylinePoints);

        // create a line symbol for the polyline
        SimpleLineSymbol polylineSymbol =
                new SimpleLineSymbol(SimpleLineSymbol.Style.SOLID, 0xFF0055B3, 2);

        // create a polyline graphic with the polyline geometry and symbol
        Graphic polylineGraphic = new Graphic(polyline, polylineSymbol);

        // add the polyline graphic to the graphics overlay
        graphicsOverlay.getGraphics().add(polylineGraphic);
        //endregion

        //region POLYLINE2
        // create a point collection with a spatial reference, and add three points to it
        polylinePoints = new PointCollection(SpatialReferences.getWgs84());
        polylinePoints.add(new Point(8.536016, 47.361379));
        polylinePoints.add(new Point(8.548891, 47.357609));

        // create a polyline geometry from the point collection
        polyline = new Polyline(polylinePoints);

        // create a polyline graphic with the polyline geometry and symbol
        polylineGraphic = new Graphic(polyline, polylineSymbol);

        // add the polyline graphic to the graphics overlay
        graphicsOverlay.getGraphics().add(polylineGraphic);
        //endregion

        //region POLYLINE3
        // create a point collection with a spatial reference, and add three points to it
        polylinePoints = new PointCollection(SpatialReferences.getWgs84());
        polylinePoints.add(new Point(8.530848, 47.371330));
        polylinePoints.add(new Point(8.531153, 47.371229));

        // create a polyline geometry from the point collection
        polyline = new Polyline(polylinePoints);

        // create a polyline graphic with the polyline geometry and symbol
        polylineGraphic = new Graphic(polyline, polylineSymbol);

        // add the polyline graphic to the graphics overlay
        graphicsOverlay.getGraphics().add(polylineGraphic);
        //endregion

        //region FEATURELAYERS
        String contourUrl = "https://services2.arcgis.com/cFEFS0EWrhfDeVw9/arcgis/rest/services/Zurich_Contour_Lines/FeatureServer/2";
        String gardensUrl = "https://services2.arcgis.com/cFEFS0EWrhfDeVw9/arcgis/rest/services/Zurich_Parks_Parcels/FeatureServer/0";
        String seismicUrl = "https://services9.arcgis.com/RHVPKKiFTONKtxq3/arcgis/rest/services/USGS_Seismic_Data_v1/FeatureServer/0";
        String glacierUrl = "https://services.arcgis.com/XSeYKQzfXnEgju9o/arcgis/rest/services/Swiss_glaciers/FeatureServer/0";

        ServiceFeatureTable contourServiceFeatureTable = new ServiceFeatureTable(contourUrl);
        ServiceFeatureTable gardensServiceFeatureTable = new ServiceFeatureTable(gardensUrl);
        ServiceFeatureTable seismicServiceFeatureTable = new ServiceFeatureTable(seismicUrl);
        ServiceFeatureTable glacierServiceFeatureTable = new ServiceFeatureTable(glacierUrl);

        hz2021Map.getOperationalLayers().add(new FeatureLayer(contourServiceFeatureTable));
        hz2021Map.getOperationalLayers().add(new FeatureLayer(gardensServiceFeatureTable));
        hz2021Map.getOperationalLayers().add(new FeatureLayer(seismicServiceFeatureTable));
        hz2021Map.getOperationalLayers().add(new FeatureLayer(glacierServiceFeatureTable));

        //endregion

    }
}