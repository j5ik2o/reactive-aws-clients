// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketWebsiteRequest => ScalaPutBucketWebsiteRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketWebsiteRequest => JavaPutBucketWebsiteRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketWebsiteRequestOps {

  implicit class ScalaPutBucketWebsiteRequestOps(val self: ScalaPutBucketWebsiteRequest) extends AnyVal {

    def toJava: JavaPutBucketWebsiteRequest = {
      val result = JavaPutBucketWebsiteRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.websiteConfiguration.foreach { v =>
        import WebsiteConfigurationOps._; result.websiteConfiguration(v.toJava)
      } // WebsiteConfiguration

      result.build()
    }

  }

}
