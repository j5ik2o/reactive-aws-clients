// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFleetsResponseBuilderOps(val self: DeleteFleetsResponse.Builder) extends AnyVal {

  final def successfulFleetDeletionsAsScala(
      value: Option[Seq[DeleteFleetSuccessItem]]
  ): DeleteFleetsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.successfulFleetDeletions(v.asJava)
    }
  }

  final def unsuccessfulFleetDeletionsAsScala(
      value: Option[Seq[DeleteFleetErrorItem]]
  ): DeleteFleetsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unsuccessfulFleetDeletions(v.asJava)
    }
  }

}

final class DeleteFleetsResponseOps(val self: DeleteFleetsResponse) extends AnyVal {

  final def successfulFleetDeletionsAsScala: Option[Seq[DeleteFleetSuccessItem]] =
    Option(self.successfulFleetDeletions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def unsuccessfulFleetDeletionsAsScala: Option[Seq[DeleteFleetErrorItem]] =
    Option(self.unsuccessfulFleetDeletions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFleetsResponseOps {

  implicit def toDeleteFleetsResponseBuilderOps(v: DeleteFleetsResponse.Builder): DeleteFleetsResponseBuilderOps =
    new DeleteFleetsResponseBuilderOps(v)

  implicit def toDeleteFleetsResponseOps(v: DeleteFleetsResponse): DeleteFleetsResponseOps =
    new DeleteFleetsResponseOps(v)

}
