// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ComposeEnvironmentsResponseBuilderOps(val self: ComposeEnvironmentsResponse.Builder) extends AnyVal {

  final def environmentsAsScala(value: Option[Seq[EnvironmentDescription]]): ComposeEnvironmentsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environments(v.asJava)
    } // Seq[EnvironmentDescription]
  }

  final def nextTokenAsScala(value: Option[String]): ComposeEnvironmentsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ComposeEnvironmentsResponseOps(val self: ComposeEnvironmentsResponse) extends AnyVal {

  final def environmentsAsScala: Option[Seq[EnvironmentDescription]] = Option(self.environments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[EnvironmentDescription]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComposeEnvironmentsResponseOps {

  implicit def toComposeEnvironmentsResponseBuilderOps(
      v: ComposeEnvironmentsResponse.Builder
  ): ComposeEnvironmentsResponseBuilderOps = new ComposeEnvironmentsResponseBuilderOps(v)

  implicit def toComposeEnvironmentsResponseOps(v: ComposeEnvironmentsResponse): ComposeEnvironmentsResponseOps =
    new ComposeEnvironmentsResponseOps(v)

}
