// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RouteTableBuilderOps(val self: RouteTable.Builder) extends AnyVal {

  final def associationsAsScala(value: Option[Seq[RouteTableAssociation]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.associations(v.asJava)
    }
  }

  final def propagatingVgwsAsScala(value: Option[Seq[PropagatingVgw]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.propagatingVgws(v.asJava)
    }
  }

  final def routeTableIdAsScala(value: Option[String]): RouteTable.Builder = {
    value.fold(self) { v =>
      self.routeTableId(v)
    }
  }

  final def routesAsScala(value: Option[Seq[Route]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routes(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def vpcIdAsScala(value: Option[String]): RouteTable.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): RouteTable.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

}

final class RouteTableOps(val self: RouteTable) extends AnyVal {

  final def associationsAsScala: Option[Seq[RouteTableAssociation]] = Option(self.associations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def propagatingVgwsAsScala: Option[Seq[PropagatingVgw]] = Option(self.propagatingVgws).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

  final def routesAsScala: Option[Seq[Route]] = Option(self.routes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRouteTableOps {

  implicit def toRouteTableBuilderOps(v: RouteTable.Builder): RouteTableBuilderOps = new RouteTableBuilderOps(v)

  implicit def toRouteTableOps(v: RouteTable): RouteTableOps = new RouteTableOps(v)

}
