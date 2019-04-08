// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LambdaFunctionConfigurationBuilderOps(val self: LambdaFunctionConfiguration.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): LambdaFunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def lambdaFunctionArnAsScala(value: Option[String]): LambdaFunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.lambdaFunctionArn(v)
    }
  } // String

  final def eventsAsScala(value: Option[Seq[Event]]): LambdaFunctionConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.events(v.asJava)
    } // Seq[String]
  }

  final def filterAsScala(value: Option[NotificationConfigurationFilter]): LambdaFunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // NotificationConfigurationFilter

}

final class LambdaFunctionConfigurationOps(val self: LambdaFunctionConfiguration) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

  final def lambdaFunctionArnAsScala: Option[String] = Option(self.lambdaFunctionArn) // String

  final def eventsAsScala: Option[Seq[Event]] = Option(self.events).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def filterAsScala: Option[NotificationConfigurationFilter] =
    Option(self.filter) // NotificationConfigurationFilter

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLambdaFunctionConfigurationOps {

  implicit def toLambdaFunctionConfigurationBuilderOps(
      v: LambdaFunctionConfiguration.Builder
  ): LambdaFunctionConfigurationBuilderOps = new LambdaFunctionConfigurationBuilderOps(v)

  implicit def toLambdaFunctionConfigurationOps(v: LambdaFunctionConfiguration): LambdaFunctionConfigurationOps =
    new LambdaFunctionConfigurationOps(v)

}
