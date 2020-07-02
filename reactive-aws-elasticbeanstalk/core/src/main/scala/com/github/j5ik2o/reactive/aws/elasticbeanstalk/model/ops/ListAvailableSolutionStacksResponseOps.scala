// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListAvailableSolutionStacksResponseBuilderOps(val self: ListAvailableSolutionStacksResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStacksAsScala(value: Option[Seq[String]]): ListAvailableSolutionStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.solutionStacks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackDetailsAsScala(
      value: Option[Seq[SolutionStackDescription]]
  ): ListAvailableSolutionStacksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.solutionStackDetails(v.asJava)
    }
  }

}

final class ListAvailableSolutionStacksResponseOps(val self: ListAvailableSolutionStacksResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStacksAsScala: Option[Seq[String]] =
    Option(self.solutionStacks).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackDetailsAsScala: Option[Seq[SolutionStackDescription]] =
    Option(self.solutionStackDetails).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
