// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListUpdatesResponseBuilderOps(val self: ListUpdatesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateIdsAsScala(value: Option[Seq[String]]): ListUpdatesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.updateIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListUpdatesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListUpdatesResponseOps(val self: ListUpdatesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateIdsAsScala: Option[Seq[String]] = Option(self.updateIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListUpdatesResponseOps {

  implicit def toListUpdatesResponseBuilderOps(v: ListUpdatesResponse.Builder): ListUpdatesResponseBuilderOps =
    new ListUpdatesResponseBuilderOps(v)

  implicit def toListUpdatesResponseOps(v: ListUpdatesResponse): ListUpdatesResponseOps = new ListUpdatesResponseOps(v)

}
