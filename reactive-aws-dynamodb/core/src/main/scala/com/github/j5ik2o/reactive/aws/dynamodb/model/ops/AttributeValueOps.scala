// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AttributeValueBuilderOps(val self: AttributeValue.Builder) extends AnyVal {

  final def sAsScala(value: Option[String]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.s(v)
    }
  } // String

  final def nAsScala(value: Option[String]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.n(v)
    }
  } // String

  final def bAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.b(v)
    }
  } // SdkBytes

  final def ssAsScala(value: Option[Seq[String]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ss(v.asJava)
    } // Seq[String]
  }

  final def nsAsScala(value: Option[Seq[String]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ns(v.asJava)
    } // Seq[String]
  }

  final def bsAsScala(value: Option[Seq[software.amazon.awssdk.core.SdkBytes]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.bs(v.asJava)
    } // Seq[SdkBytes]
  }

  final def mAsScala(value: Option[Map[String, AttributeValue]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.m(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def lAsScala(value: Option[Seq[AttributeValue]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.l(v.asJava)
    } // Seq[AttributeValue]
  }

  final def boolAsScala(value: Option[Boolean]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.bool(v)
    }
  } // Boolean

  final def nulAsScala(value: Option[Boolean]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.nul(v)
    }
  } // Boolean

}

final class AttributeValueOps(val self: AttributeValue) extends AnyVal {

  final def sAsScala: Option[String] = Option(self.s) // String

  final def nAsScala: Option[String] = Option(self.n) // String

  final def bAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.b) // SdkBytes

  final def ssAsScala: Option[Seq[String]] = Option(self.ss).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def nsAsScala: Option[Seq[String]] = Option(self.ns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def bsAsScala: Option[Seq[software.amazon.awssdk.core.SdkBytes]] = Option(self.bs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[SdkBytes]

  final def mAsScala: Option[Map[String, AttributeValue]] = Option(self.m).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def lAsScala: Option[Seq[AttributeValue]] = Option(self.l).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AttributeValue]

  final def boolAsScala: Option[Boolean] = Option(self.bool) // Boolean

  final def nulAsScala: Option[Boolean] = Option(self.nul) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeValueOps {

  implicit def toAttributeValueBuilderOps(v: AttributeValue.Builder): AttributeValueBuilderOps =
    new AttributeValueBuilderOps(v)

  implicit def toAttributeValueOps(v: AttributeValue): AttributeValueOps = new AttributeValueOps(v)

}
