// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListServicesResponseBuilderOps(val self: ListServicesResponse.Builder) extends AnyVal {

  final def serviceArnsAsScala(value: Option[Seq[String]]): ListServicesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceArns(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListServicesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListServicesResponseOps(val self: ListServicesResponse) extends AnyVal {

  final def serviceArnsAsScala: Option[Seq[String]] = Option(self.serviceArns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListServicesResponseOps {

  implicit def toListServicesResponseBuilderOps(v: ListServicesResponse.Builder): ListServicesResponseBuilderOps =
    new ListServicesResponseBuilderOps(v)

  implicit def toListServicesResponseOps(v: ListServicesResponse): ListServicesResponseOps =
    new ListServicesResponseOps(v)

}
