// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ RequestPaymentConfiguration => ScalaRequestPaymentConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ RequestPaymentConfiguration => JavaRequestPaymentConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RequestPaymentConfigurationOps {

  implicit class ScalaRequestPaymentConfigurationOps(val self: ScalaRequestPaymentConfiguration) extends AnyVal {

    def toJava: JavaRequestPaymentConfiguration = {
      val result = JavaRequestPaymentConfiguration.builder()
      self.payer.foreach { v =>
        import PayerOps._; result.payer(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaRequestPaymentConfigurationOps(val self: JavaRequestPaymentConfiguration) extends AnyVal {

    def toScala: ScalaRequestPaymentConfiguration = {
      ScalaRequestPaymentConfiguration()
        .withPayer(Option(self.payer).map { v =>
          import PayerOps._; v.toScala
        }) // String
    }

  }

}
