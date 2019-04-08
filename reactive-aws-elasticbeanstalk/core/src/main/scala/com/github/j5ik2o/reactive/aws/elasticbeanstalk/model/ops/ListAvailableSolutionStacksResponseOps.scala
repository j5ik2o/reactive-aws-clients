// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListAvailableSolutionStacksResponseBuilderOps(val self: ListAvailableSolutionStacksResponse.Builder)
    extends AnyVal {

  final def solutionStacksAsScala(value: Option[Seq[String]]): ListAvailableSolutionStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.solutionStacks(v.asJava)
    }
  }

  final def solutionStackDetailsAsScala(
      value: Option[Seq[SolutionStackDescription]]
  ): ListAvailableSolutionStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.solutionStackDetails(v.asJava)
    }
  }

}

final class ListAvailableSolutionStacksResponseOps(val self: ListAvailableSolutionStacksResponse) extends AnyVal {

  final def solutionStacksAsScala: Option[Seq[String]] = Option(self.solutionStacks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def solutionStackDetailsAsScala: Option[Seq[SolutionStackDescription]] = Option(self.solutionStackDetails).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAvailableSolutionStacksResponseOps {

  implicit def toListAvailableSolutionStacksResponseBuilderOps(
      v: ListAvailableSolutionStacksResponse.Builder
  ): ListAvailableSolutionStacksResponseBuilderOps = new ListAvailableSolutionStacksResponseBuilderOps(v)

  implicit def toListAvailableSolutionStacksResponseOps(
      v: ListAvailableSolutionStacksResponse
  ): ListAvailableSolutionStacksResponseOps = new ListAvailableSolutionStacksResponseOps(v)

}
