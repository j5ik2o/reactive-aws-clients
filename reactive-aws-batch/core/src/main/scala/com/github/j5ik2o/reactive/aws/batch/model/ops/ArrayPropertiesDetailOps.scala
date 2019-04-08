// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ArrayPropertiesDetailBuilderOps(val self: ArrayPropertiesDetail.Builder) extends AnyVal {

  final def statusSummaryAsScala(value: Option[Map[String, Int]]): ArrayPropertiesDetail.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.Integer])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.statusSummary(v.asJava)
    } // Map[String, Int]
  }

  final def sizeAsScala(value: Option[Int]): ArrayPropertiesDetail.Builder = {
    value.fold(self) { v =>
      self.size(v)
    }
  } // Int

  final def indexAsScala(value: Option[Int]): ArrayPropertiesDetail.Builder = {
    value.fold(self) { v =>
      self.index(v)
    }
  } // Int

}

final class ArrayPropertiesDetailOps(val self: ArrayPropertiesDetail) extends AnyVal {

  final def statusSummaryAsScala: Option[Map[String, Int]] = Option(self.statusSummary).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.intValue())
  } // Map[String, Int]

  final def sizeAsScala: Option[Int] = Option(self.size) // Int

  final def indexAsScala: Option[Int] = Option(self.index) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToArrayPropertiesDetailOps {

  implicit def toArrayPropertiesDetailBuilderOps(v: ArrayPropertiesDetail.Builder): ArrayPropertiesDetailBuilderOps =
    new ArrayPropertiesDetailBuilderOps(v)

  implicit def toArrayPropertiesDetailOps(v: ArrayPropertiesDetail): ArrayPropertiesDetailOps =
    new ArrayPropertiesDetailOps(v)

}
