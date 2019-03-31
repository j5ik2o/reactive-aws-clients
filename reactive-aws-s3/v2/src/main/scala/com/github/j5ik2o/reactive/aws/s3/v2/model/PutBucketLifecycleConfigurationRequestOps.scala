// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketLifecycleConfigurationRequest => ScalaPutBucketLifecycleConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketLifecycleConfigurationRequest => JavaPutBucketLifecycleConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketLifecycleConfigurationRequestOps {

  implicit class ScalaPutBucketLifecycleConfigurationRequestOps(val self: ScalaPutBucketLifecycleConfigurationRequest)
      extends AnyVal {

    def toJava: JavaPutBucketLifecycleConfigurationRequest = {
      val result = JavaPutBucketLifecycleConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.lifecycleConfiguration.foreach { v =>
        import BucketLifecycleConfigurationOps._; result.lifecycleConfiguration(v.toJava)
      } // BucketLifecycleConfiguration

      result.build()
    }

  }

}
