// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ResourceBuilderOps(val self: Resource.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): Resource.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def typeAsScala(value: Option[String]): Resource.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def doubleValueAsScala(value: Option[Double]): Resource.Builder = {
    value.fold(self) { v =>
      self.doubleValue(v)
    }
  }

  final def longValueAsScala(value: Option[Long]): Resource.Builder = {
    value.fold(self) { v =>
      self.longValue(v)
    }
  }

  final def integerValueAsScala(value: Option[Int]): Resource.Builder = {
    value.fold(self) { v =>
      self.integerValue(v)
    }
  }

  final def stringSetValueAsScala(value: Option[Seq[String]]): Resource.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stringSetValue(v.asJava)
    }
  }

}

final class ResourceOps(val self: Resource) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def doubleValueAsScala: Option[Double] = Option(self.doubleValue)

  final def longValueAsScala: Option[Long] = Option(self.longValue)

  final def integerValueAsScala: Option[Int] = Option(self.integerValue)

  final def stringSetValueAsScala: Option[Seq[String]] = Option(self.stringSetValue).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceOps {

  implicit def toResourceBuilderOps(v: Resource.Builder): ResourceBuilderOps = new ResourceBuilderOps(v)

  implicit def toResourceOps(v: Resource): ResourceOps = new ResourceOps(v)

}
