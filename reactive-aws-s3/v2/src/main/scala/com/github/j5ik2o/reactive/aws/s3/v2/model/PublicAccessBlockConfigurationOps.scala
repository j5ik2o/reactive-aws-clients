// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  PublicAccessBlockConfiguration => ScalaPublicAccessBlockConfiguration,
  _
}
import software.amazon.awssdk.services.s3.model.{ PublicAccessBlockConfiguration => JavaPublicAccessBlockConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PublicAccessBlockConfigurationOps {

  implicit class ScalaPublicAccessBlockConfigurationOps(val self: ScalaPublicAccessBlockConfiguration) extends AnyVal {

    def toJava: JavaPublicAccessBlockConfiguration = {
      val result = JavaPublicAccessBlockConfiguration.builder()
      self.blockPublicAcls.map(_.booleanValue).foreach(v => result.blockPublicAcls(v))             // Boolean
      self.ignorePublicAcls.map(_.booleanValue).foreach(v => result.ignorePublicAcls(v))           // Boolean
      self.blockPublicPolicy.map(_.booleanValue).foreach(v => result.blockPublicPolicy(v))         // Boolean
      self.restrictPublicBuckets.map(_.booleanValue).foreach(v => result.restrictPublicBuckets(v)) // Boolean

      result.build()
    }

  }

  implicit class JavaPublicAccessBlockConfigurationOps(val self: JavaPublicAccessBlockConfiguration) extends AnyVal {

    def toScala: ScalaPublicAccessBlockConfiguration = {
      ScalaPublicAccessBlockConfiguration()
        .withBlockPublicAcls(Option(self.blockPublicAcls).map(_.booleanValue)) // Boolean
        .withIgnorePublicAcls(Option(self.ignorePublicAcls).map(_.booleanValue)) // Boolean
        .withBlockPublicPolicy(Option(self.blockPublicPolicy).map(_.booleanValue)) // Boolean
        .withRestrictPublicBuckets(Option(self.restrictPublicBuckets).map(_.booleanValue)) // Boolean
    }

  }

}
