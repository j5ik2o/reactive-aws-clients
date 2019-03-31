// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketAccelerateConfigurationRequest => ScalaPutBucketAccelerateConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketAccelerateConfigurationRequest => JavaPutBucketAccelerateConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketAccelerateConfigurationRequestOps {

  implicit class ScalaPutBucketAccelerateConfigurationRequestOps(val self: ScalaPutBucketAccelerateConfigurationRequest)
      extends AnyVal {

    def toJava: JavaPutBucketAccelerateConfigurationRequest = {
      val result = JavaPutBucketAccelerateConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.accelerateConfiguration.foreach { v =>
        import AccelerateConfigurationOps._; result.accelerateConfiguration(v.toJava)
      } // AccelerateConfiguration

      result.build()
    }

  }

}
