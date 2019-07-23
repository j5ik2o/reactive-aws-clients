// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AttributeValueBuilderOps(val self: AttributeValue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sAsScala(value: Option[String]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.s(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nAsScala(value: Option[String]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.n(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.b(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssAsScala(value: Option[Seq[String]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ss(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nsAsScala(value: Option[Seq[String]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ns(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bsAsScala(value: Option[Seq[software.amazon.awssdk.core.SdkBytes]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.bs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mAsScala(value: Option[Map[String, AttributeValue]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.m(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lAsScala(value: Option[Seq[AttributeValue]]): AttributeValue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.l(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boolAsScala(value: Option[Boolean]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.bool(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nulAsScala(value: Option[Boolean]): AttributeValue.Builder = {
    value.fold(self) { v =>
      self.nul(v)
    }
  }

}

final class AttributeValueOps(val self: AttributeValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sAsScala: Option[String] = Option(self.s)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nAsScala: Option[String] = Option(self.n)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.b)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssAsScala: Option[Seq[String]] = Option(self.ss).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nsAsScala: Option[Seq[String]] = Option(self.ns).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bsAsScala: Option[Seq[software.amazon.awssdk.core.SdkBytes]] = Option(self.bs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mAsScala: Option[Map[String, AttributeValue]] = Option(self.m).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lAsScala: Option[Seq[AttributeValue]] = Option(self.l).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boolAsScala: Option[Boolean] = Option(self.bool)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nulAsScala: Option[Boolean] = Option(self.nul)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttributeValueOps {

  implicit def toAttributeValueBuilderOps(v: AttributeValue.Builder): AttributeValueBuilderOps =
    new AttributeValueBuilderOps(v)

  implicit def toAttributeValueOps(v: AttributeValue): AttributeValueOps = new AttributeValueOps(v)

}
