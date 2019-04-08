// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class EnvironmentResponseBuilderOps(val self: EnvironmentResponse.Builder) extends AnyVal {

  final def variablesAsScala(value: Option[Map[String, String]]): EnvironmentResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.variables(v.asJava)
    }
  }

  final def errorAsScala(value: Option[EnvironmentError]): EnvironmentResponse.Builder = {
    value.fold(self) { v =>
      self.error(v)
    }
  }

}

final class EnvironmentResponseOps(val self: EnvironmentResponse) extends AnyVal {

  final def variablesAsScala: Option[Map[String, String]] = Option(self.variables).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def errorAsScala: Option[EnvironmentError] = Option(self.error)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentResponseOps {

  implicit def toEnvironmentResponseBuilderOps(v: EnvironmentResponse.Builder): EnvironmentResponseBuilderOps =
    new EnvironmentResponseBuilderOps(v)

  implicit def toEnvironmentResponseOps(v: EnvironmentResponse): EnvironmentResponseOps = new EnvironmentResponseOps(v)

}
