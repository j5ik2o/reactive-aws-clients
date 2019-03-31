// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  ServerSideEncryptionConfiguration => ScalaServerSideEncryptionConfiguration,
  _
}
import software.amazon.awssdk.services.s3.model.{
  ServerSideEncryptionConfiguration => JavaServerSideEncryptionConfiguration
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ServerSideEncryptionConfigurationOps {

  implicit class ScalaServerSideEncryptionConfigurationOps(val self: ScalaServerSideEncryptionConfiguration)
      extends AnyVal {

    def toJava: JavaServerSideEncryptionConfiguration = {
      val result = JavaServerSideEncryptionConfiguration.builder()
      self.rules.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ServerSideEncryptionRuleOps._; result.rules(v.map(_.toJava).asJava)
      } // Seq[ServerSideEncryptionRule]

      result.build()
    }

  }

  implicit class JavaServerSideEncryptionConfigurationOps(val self: JavaServerSideEncryptionConfiguration)
      extends AnyVal {

    def toScala: ScalaServerSideEncryptionConfiguration = {
      ScalaServerSideEncryptionConfiguration()
        .withRules(Option(self.rules).map { v =>
          import scala.collection.JavaConverters._, ServerSideEncryptionRuleOps._; v.asScala.map(_.toScala)
        }) // Seq[ServerSideEncryptionRule]
    }

  }

}
