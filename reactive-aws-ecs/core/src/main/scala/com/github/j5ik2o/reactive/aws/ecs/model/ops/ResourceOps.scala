// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ResourceBuilderOps(val self: Resource.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Resource.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): Resource.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def doubleValueAsScala(value: Option[Double]): Resource.Builder = {
    value.fold(self) { v => self.doubleValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def longValueAsScala(value: Option[Long]): Resource.Builder = {
    value.fold(self) { v => self.longValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def integerValueAsScala(value: Option[Int]): Resource.Builder = {
    value.fold(self) { v => self.integerValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stringSetValueAsScala(value: Option[Seq[String]]): Resource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stringSetValue(v.asJava)
    }
  }

}

final class ResourceOps(val self: Resource) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def doubleValueAsScala: Option[Double] = Option(self.doubleValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def longValueAsScala: Option[Long] = Option(self.longValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def integerValueAsScala: Option[Int] = Option(self.integerValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stringSetValueAsScala: Option[Seq[String]] =
    Option(self.stringSetValue).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceOps {

  implicit def toResourceBuilderOps(v: Resource.Builder): ResourceBuilderOps = new ResourceBuilderOps(v)

  implicit def toResourceOps(v: Resource): ResourceOps = new ResourceOps(v)

}
