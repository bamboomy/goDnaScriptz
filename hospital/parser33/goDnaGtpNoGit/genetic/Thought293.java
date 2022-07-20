package genetic;
import java.util.ArrayList;
class Thought293 extends Thought{
private static ArrayList<Thought293> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 271.01409923339014;
private double fd1 = 300.48026186592807;
private Thought fo0 = null;
private Thought fo1 = null;
Thought293 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought293 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought293 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought293 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought293 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought293 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought293 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought293 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought293 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought293 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought293 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought293 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought293 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought293 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought293 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought293 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought293 instance = new Thought293 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - fd0;
        if (fb0) {
            fd1 = fd0 - fd1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought191.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Output.points[4][0] -= fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought136.getInstance();
    double ld1 = 3.1262299308600845;
    ad3 = ad4 + fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ld1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld2 = 252.95593842545088;
    boolean lb3 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
}
    lb3 = !fb0;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    fb0 = ld1 < ld2;
    fb1 = ad1 < ad2;
    lb3 = lb4 && fb0;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    fb1 = ld1 > ld2;
    lb3 = lb4 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
if(fo0 != null){
          fo0.m3();
}
        ad2 *= -1;
        ad3 = ad4 + fd0;
        fd1 *= -1;
        ab3 = !ab4;
        Output.points[4][1] += ad1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ad1 = ad2 - ad3;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        ad3 *= -1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    fd0 = fd1 - fd0;
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    boolean lb1 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 939.0543780726018;
    fb1 = fb0 || fb1;
    fb0 = ad1 > ad2;
    ad3 *= -1;
    fb1 = ad4 < fd0;
    double ld1 = 825.0982217681842;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb2 = ao4.m2(fb0, fb1, lb2, fb0);
}
    fb1 = ld1 > ad1;
        lb2 = fb0 && fb1;
    double ld3 = 692.8629595599326;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, ld1, ld3, fb1, lb2, fb0, fb1);
}
    ad1 = ad2 + ad3;
    boolean lb4 = false;
    lb2 = lb4 || fb0;
    fb1 = !lb2;
    lb4 = fb0 && fb1;
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, lb2, lb4, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(fd1, ld0, ld1, ld3);
}
    lb2 = lb4 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 655.0375614009482;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    Output.points[4][2] += fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fb0 = fb1 || ab1;
    Output.points[4][3] -= ld0;
    Thought lo1 = Thought270.getInstance(ab2, ab3, ab4, fb0);
    Thought lo2 = Thought144.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld3 = 779.1125634175738;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    Thought lo5 = Thought381.getInstance(ao1, ao2, ao3, ao4);
    if (lb4) {
        Thought lo6 = Thought86.getInstance(ld0, ld3, fd0, fd1);
        double ld7 = 163.19525841078627;
        ab1 = ld7 < ld0;
        Output.points[4][4] -= ld3;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = !ab4;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    fd0 *= -1;
    fd1 *= -1;
    ab4 = ad1 > ad2;
    Thought lo2 = Thought118.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    Thought lo3 = Thought366.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 935.6864932779652;
    Thought lo1 = Thought215.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1);
}
    double ld2 = 325.8044381710703;
    Thought lo3 = Thought173.getInstance(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
    ld0 = ld2 + fd0;
    Output.points[4][5] += fd1;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
if(fo1 != null){
      fo1.m3(ld2, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld2 = fd0 - fd1;
    boolean lb4 = false;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] += fd1;
        boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = !ab1;
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Thought lo2 = Thought81.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought322.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
    Output.points[4][7] -= ad1;
        Output.points[4][8] += ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo0.m2();
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
    ab4 = ad3 < ad4;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    Output.points[5][0] -= ad3;
    ad4 *= -1;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 518.1937568095293;
    ld0 = fd0 + fd1;
    fb0 = !fb1;
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought35.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb3 = true;
    Thought lo4 = Thought211.getInstance();
    lb1 = lb3 || fb0;
if(fo1 != null){
      fo1.m1(fb1, lb1, lb3, fb0);
}
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, lb1, lb3, fb0);
}
    fd1 = ld0 + fd0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
        fb1 = !lb0;
        fb0 = fb1 || lb0;
        ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
        }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
    Output.points[5][1] -= ad3;
    double ld2 = 528.6932211817766;
    Thought lo3 = Thought198.getInstance(ad3, ad4, fd0, fd1);
    ld2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb0);
}
    double ld4 = 661.6441567412962;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        ab2 = ab3 || ab4;
        fb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
        fb1 = ab1 || ab2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        double ld0 = 802.6635016957233;
        ld0 = fd0 - fd1;
        ld0 = fd0 - fd1;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ld0 = ao3.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
        double ld1 = 896.5641941526555;
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][2] -= ad1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought327.getInstance();
    Output.points[5][3] += ad2;
    boolean lb1 = true;
    boolean lb2 = true;
    ad3 *= -1;
        Output.points[5][4] += ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    Output.points[5][5] += ad3;
    Output.points[5][6] += ad4;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
        Output.points[5][7] -= fd1;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    lb2 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[5][8] += fd1;
    lb0 = lb1 || lb2;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    double ld0 = 633.4641489177862;
if(fo1 != null){
      ab1 = fo1.m2();
}
    Thought lo1 = Thought102.getInstance(ab2, ab3, ab4, fb0);
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        fb1 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    fb1 = !fb0;
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[6][0] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    ab1 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought370.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld1 = 173.65422206780286;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld2 = 651.1204064464284;
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld1);
}
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2);
}
    fd0 = fd1 + ld1;
    fb1 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought161.getInstance(fb0, fb1, fb0, fb1);
    Thought lo4 = Thought168.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
    fd1 = ld1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    ld1 *= -1;
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd0 = fd1 + ld1;
    double ld5 = 306.14051060360777;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    ld5 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought14.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 *= -1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
    Thought lo2 = Thought162.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    Output.points[6][1] -= ad1;
if(fo0 != null){
      fo0.m3();
}
    fb1 = !lb0;
    ad2 *= -1;
    fb0 = ad3 < ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 859.5010098585626;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought51.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Output.points[6][2] -= fd0;
    double ld2 = 777.2452378173349;
    double ld3 = 590.6729621909759;
    Thought lo4 = Thought253.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = ld3 < fd0;
    fb0 = fd1 < ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ld2 = ao1.m3(ld3, fd0, fd1, ld0);
}

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought49.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
    boolean lb1 = true;
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
    double ld2 = 29.562467094255823;
    boolean lb3 = false;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ld2 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ld2, ad1, ad2, ad3);
}
    ad4 *= -1;
    lb3 = !ab1;
    fd0 = fd1 - ld2;
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}
    boolean lb4 = false;
    ab4 = fb0 && fb1;
    lb1 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 202.3365149376224;
    Output.points[6][3] += fd0;
    Thought lo1 = Thought62.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] += fd0;
    Thought lo0 = Thought124.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab1 = ab2 || ab3;
    Thought lo1 = Thought363.getInstance();
    ab4 = fb0 && fb1;
    ab1 = fd1 < fd0;
    Output.points[6][5] -= fd1;
    double ld2 = 267.81439261410367;
    ab2 = ld2 < fd0;
    boolean lb3 = false;
    ab2 = fd1 > ld2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    double ld4 = 553.4011670638432;
    Output.points[6][6] -= ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld4, lb3, ab1, ab2, ab3);
}
    fd0 = fd1 + ld2;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld2, ab4, fb0, fb1, lb3);
}
    ld4 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    lb3 = ld2 < ld4;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
    double ld0 = 193.76756824196366;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m2();
}
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
    double ld3 = 898.9235343122597;
    lb1 = lb2 && fb0;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld3, ad1, ad2, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ab2 = ab3 || ab4;
        ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    double ld1 = 923.3951696059737;
    ld1 *= -1;
    ab4 = fb0 || fb1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought228.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
    boolean lb3 = false;
    lb3 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld4 = 46.57936490194167;
    boolean lb5 = false;
    ad1 = ad2 + ad3;
    boolean lb6 = true;
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ld1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 243.0541592237212;
    double ld1 = 363.11866047967766;
    Output.points[6][7] += ld1;
    boolean lb2 = true;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
}
    Thought lo3 = Thought235.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld4 = 676.9162382736947;
        fb1 = lb2 && fb0;
        ld4 *= -1;
        Thought lo5 = Thought238.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
        Thought lo6 = Thought375.getInstance(ld4, ld0, ld1, fd0, lb2, fb0, fb1, lb2);
        }

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    fb0 = fd1 < ad1;
    Output.points[6][8] -= ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 377.3389795696349;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
    fb1 = !fb0;
    double ld1 = 840.7013822852574;
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    ad2 = ad3 - ad4;
    lb2 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ld0;
    lb2 = fb0 && fb1;
        Thought lo3 = Thought333.getInstance(lb2, fb0, fb1, lb2);

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    double ld0 = 215.8830029341951;
    boolean lb1 = true;
    boolean lb2 = true;
    Output.points[7][0] -= ld0;
    ab2 = !ab3;
    ab4 = !fb0;
    fd0 *= -1;
    double ld3 = 166.9141570241937;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, lb2, ab1);
}
    boolean lb4 = true;
    if (ab1) {
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld0, ld3, fd0);
}
        Thought lo5 = Thought396.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, ld3, fd0);
        boolean lb6 = true;
        Thought lo7 = Thought54.getInstance();
        double ld8 = 791.5389202744522;
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
        Output.points[7][1] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld8, ld0, ld3, fb0, fb1, lb6, lb1);
}
        fd0 *= -1;
        fd1 = ld8 + ld0;
if(ao2 != null){
          ao2.m1(ld3, fd0, fd1, ld8, lb2, lb4, ab1, ab2);
}
        ab3 = ab4 || fb0;
        ld0 = ld3 + fd0;
        Thought lo9 = Thought246.getInstance(ao3, ao4, fo0, fo1, fb1, lb6, lb1, lb2);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 614.4835644183389;
    double ld1 = 880.689051321967;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    ab2 = ld0 > ld1;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    if (fb0) {
        if (fb1) {
            for(int i0=0; i0<10; i0++){
}}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought218.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    Output.points[7][2] -= fd0;
    Thought lo1 = Thought310.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    Thought lo2 = Thought174.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    Output.points[7][3] += fd0;
    Thought lo4 = Thought140.getInstance(fd1, fd0, fd1, fd0);
    boolean lb5 = false;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb5 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    Thought lo0 = Thought200.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[7][4] += fd1;
    Thought lo1 = Thought39.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fb0 = !fb1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    Output.points[7][5] += fd1;
    boolean lb4 = true;
    boolean lb5 = true;
    fd0 = fd1 - fd0;
    lb2 = lb3 && lb4;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb5 = !fb0;
    double ld6 = 120.75441531368824;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = !fb0;
    Thought lo0 = Thought263.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb1 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
