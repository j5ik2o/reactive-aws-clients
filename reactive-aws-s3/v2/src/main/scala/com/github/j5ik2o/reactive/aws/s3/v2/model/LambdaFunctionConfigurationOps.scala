// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ LambdaFunctionConfiguration => ScalaLambdaFunctionConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ LambdaFunctionConfiguration => JavaLambdaFunctionConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LambdaFunctionConfigurationOps {

  implicit class ScalaLambdaFunctionConfigurationOps(val self: ScalaLambdaFunctionConfiguration) extends AnyVal {

    def toJava: JavaLambdaFunctionConfiguration = {
      val result = JavaLambdaFunctionConfiguration.builder()
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))                               // String
      self.lambdaFunctionArn.filter(_.nonEmpty).foreach(v => result.lambdaFunctionArn(v)) // String
      self.events.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, EventOps._; result.events(v.map(_.toJava).asJava)
      } // Seq[String]
      self.filter.foreach { v =>
        import NotificationConfigurationFilterOps._; result.filter(v.toJava)
      } // NotificationConfigurationFilter

      result.build()
    }

  }

  implicit class JavaLambdaFunctionConfigurationOps(val self: JavaLambdaFunctionConfiguration) extends AnyVal {

    def toScala: ScalaLambdaFunctionConfiguration = {
      ScalaLambdaFunctionConfiguration()
        .withId(Option(self.id)) // String
        .withLambdaFunctionArn(Option(self.lambdaFunctionArn)) // String
        .withEvents(Option(self.events).map { v =>
          import scala.collection.JavaConverters._, EventOps._; v.asScala.map(_.toScala)
        }) // Seq[String]
        .withFilter(Option(self.filter).map { v =>
          import NotificationConfigurationFilterOps._; v.toScala
        }) // NotificationConfigurationFilter
    }

  }

}
