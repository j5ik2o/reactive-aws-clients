// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListChangeSetsResponseBuilderOps(val self: ListChangeSetsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala(value: Option[Seq[ChangeSetSummary]]): ListChangeSetsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.summaries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListChangeSetsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListChangeSetsResponseOps(val self: ListChangeSetsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summariesAsScala: Option[Seq[ChangeSetSummary]] = Option(self.summaries).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListChangeSetsResponseOps {

  implicit def toListChangeSetsResponseBuilderOps(v: ListChangeSetsResponse.Builder): ListChangeSetsResponseBuilderOps =
    new ListChangeSetsResponseBuilderOps(v)

  implicit def toListChangeSetsResponseOps(v: ListChangeSetsResponse): ListChangeSetsResponseOps =
    new ListChangeSetsResponseOps(v)

}
