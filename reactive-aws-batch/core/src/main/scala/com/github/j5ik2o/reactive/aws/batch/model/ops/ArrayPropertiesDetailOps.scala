// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ArrayPropertiesDetailBuilderOps(val self: ArrayPropertiesDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusSummaryAsScala(value: Option[Map[String, Int]]): ArrayPropertiesDetail.Builder = {
    value
      .filter(_.nonEmpty).map(_.view.map { case (k, v) => (k, v.asInstanceOf[java.lang.Integer]) }.toMap).fold(self) {
        v =>
          import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.statusSummary(v.asJava)
      }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Int]): ArrayPropertiesDetail.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexAsScala(value: Option[Int]): ArrayPropertiesDetail.Builder = {
    value.fold(self) { v =>
      self.index(v)
    }
  }

}

final class ArrayPropertiesDetailOps(val self: ArrayPropertiesDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusSummaryAsScala: Option[Map[String, Int]] = Option(self.statusSummary).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
    v.asScala.toMap.view.map { case (k, v) => (k, v.intValue()) }.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Int] = Option(self.size)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def indexAsScala: Option[Int] = Option(self.index)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToArrayPropertiesDetailOps {

  implicit def toArrayPropertiesDetailBuilderOps(v: ArrayPropertiesDetail.Builder): ArrayPropertiesDetailBuilderOps =
    new ArrayPropertiesDetailBuilderOps(v)

  implicit def toArrayPropertiesDetailOps(v: ArrayPropertiesDetail): ArrayPropertiesDetailOps =
    new ArrayPropertiesDetailOps(v)

}
