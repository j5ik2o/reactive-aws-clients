// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListChangeSetsResponseBuilderOps(val self: ListChangeSetsResponse.Builder) extends AnyVal {

  final def summariesAsScala(value: Option[Seq[ChangeSetSummary]]): ListChangeSetsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.summaries(v.asJava)
    } // Seq[ChangeSetSummary]
  }

  final def nextTokenAsScala(value: Option[String]): ListChangeSetsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListChangeSetsResponseOps(val self: ListChangeSetsResponse) extends AnyVal {

  final def summariesAsScala: Option[Seq[ChangeSetSummary]] = Option(self.summaries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ChangeSetSummary]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListChangeSetsResponseOps {

  implicit def toListChangeSetsResponseBuilderOps(v: ListChangeSetsResponse.Builder): ListChangeSetsResponseBuilderOps =
    new ListChangeSetsResponseBuilderOps(v)

  implicit def toListChangeSetsResponseOps(v: ListChangeSetsResponse): ListChangeSetsResponseOps =
    new ListChangeSetsResponseOps(v)

}
