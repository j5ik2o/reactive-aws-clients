// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketCorsRequest => ScalaPutBucketCorsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketCorsRequest => JavaPutBucketCorsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketCorsRequestOps {

  implicit class ScalaPutBucketCorsRequestOps(val self: ScalaPutBucketCorsRequest) extends AnyVal {

    def toJava: JavaPutBucketCorsRequest = {
      val result = JavaPutBucketCorsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.corsConfiguration.foreach { v =>
        import CORSConfigurationOps._; result.corsConfiguration(v.toJava)
      } // CORSConfiguration
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String

      result.build()
    }

  }

}
