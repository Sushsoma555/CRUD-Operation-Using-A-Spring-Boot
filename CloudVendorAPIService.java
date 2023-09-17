package com.thinkconstructive.restdemo.Controller;


import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

      CloudVendor cloudVendor;
         @GetMapping("{vendorId}")
         public CloudVendor getCloudVendorDetails(String VendorId) {

           return cloudVendor;
         //  return new CloudVendor( "C1","Vendor 1" ,"Address One","7498833629");

         }

         @PostMapping
         public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
         {
             this.cloudVendor =cloudVendor;
             return "Cloud Vendor Create Successfully";
         }


         @PutMapping
         public String upadteCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
        {
             this.cloudVendor =cloudVendor;
             return "Cloud Vendor Upadted Successfully";
        }

         @DeleteMapping("{vendorID}")
          public String deleteCloudVendorDetails(String vendorID)
         {

        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
         }

 }
