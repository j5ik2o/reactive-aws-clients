// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFleetResponseBuilderOps(val self: CreateFleetResponse.Builder) extends AnyVal {

  final def fleetIdAsScala(value: Option[String]): CreateFleetResponse.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

  final def errorsAsScala(value: Option[Seq[CreateFleetError]]): CreateFleetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.errors(v.asJava)
    }
  }

  final def instancesAsScala(value: Option[Seq[CreateFleetInstance]]): CreateFleetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    }
  }

}

final class CreateFleetResponseOps(val self: CreateFleetResponse) extends AnyVal {

  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

  final def errorsAsScala: Option[Seq[CreateFleetError]] = Option(self.errors).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instancesAsScala: Option[Seq[CreateFleetInstance]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFleetResponseOps {

  implicit def toCreateFleetResponseBuilderOps(v: CreateFleetResponse.Builder): CreateFleetResponseBuilderOps =
    new CreateFleetResponseBuilderOps(v)

  implicit def toCreateFleetResponseOps(v: CreateFleetResponse): CreateFleetResponseOps = new CreateFleetResponseOps(v)

}
