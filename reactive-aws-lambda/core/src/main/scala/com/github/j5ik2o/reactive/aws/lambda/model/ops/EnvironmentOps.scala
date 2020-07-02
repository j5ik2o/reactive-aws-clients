// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class EnvironmentBuilderOps(val self: Environment.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def variablesAsScala(value: Option[Map[String, String]]): Environment.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.variables(v.asJava)
    }
  }

}

final class EnvironmentOps(val self: Environment) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def variablesAsScala: Option[Map[String, String]] =
    Option(self.variables).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentOps {

  implicit def toEnvironmentBuilderOps(v: Environment.Builder): EnvironmentBuilderOps = new EnvironmentBuilderOps(v)

  implicit def toEnvironmentOps(v: Environment): EnvironmentOps = new EnvironmentOps(v)

}
