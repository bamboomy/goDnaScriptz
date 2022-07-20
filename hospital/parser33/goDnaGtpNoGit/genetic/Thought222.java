package genetic;
import java.util.ArrayList;
class Thought222 extends Thought{
private static ArrayList<Thought222> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 278.69885819963787;
private double fd1 = 316.5244625940845;
private Thought fo0 = null;
private Thought fo1 = null;
Thought222 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought222 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought222 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought222 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought222 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought222 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought222 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought222 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought222 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought222 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought222 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought222 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought222 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought222 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought222 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought222 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought222 instance = new Thought222 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 742.0355304094534;
    fb1 = fb0 && fb1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        double ld0 = 592.4803967699937;
        ab2 = ld0 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo1 = Thought298.getInstance(ab3, ab4, fb0, fb1);
        ab1 = ab2 || ab3;
        boolean lb2 = true;
        ab3 = ab4 && fb0;
        boolean lb3 = true;
        fd0 = fd1 + ld0;
        fb0 = fd0 > fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb2, lb3, ab1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 500.27342170192367;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought5.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought192.getInstance(ad1, ad2, ad3, ad4);
    fb1 = fd0 > fd1;
    ld0 = ad1 - ad2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    boolean lb3 = true;
    Thought lo4 = Thought227.getInstance();
    Thought lo5 = Thought168.getInstance(fb0, fb1, lb3, fb0);
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;

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
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
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
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    double ld0 = 336.7139869469778;
    boolean lb1 = false;
        ld0 *= -1;
    double ld2 = 958.8334105793457;
    ld2 = fd0 - fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[6][1] += ad1;
    lb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    ad2 = ad3 - ad4;
    Thought lo1 = Thought333.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    Output.points[6][2] -= ad3;

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
    boolean lb0 = false;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld1 = 135.7167580128678;
    Output.points[6][3] -= ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
    Thought lo2 = Thought302.getInstance();
    fb1 = lb0 || ab1;
    Thought lo3 = Thought391.getInstance(ab2, ab3, ab4, fb0);
    ld1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ld1 *= -1;
    Output.points[6][4] += fd0;
if(ao2 != null){
      ao2.m3(fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    ab1 = !ab2;
    Output.points[6][5] += ad1;
    ab3 = ab4 || fb0;
    Output.points[6][6] -= ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    lb0 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought356.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 98.56055748996108;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, lb3, ab1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[6][7] += fd0;
if(ao4 != null){
      fd1 = ao4.m3(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2);
}
    boolean lb4 = false;

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
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    Output.points[6][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 500.3619999199841;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought107.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Output.points[7][0] += fd0;
    fd1 = ld0 + fd0;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = !lb3;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fd1 = ld0 + fd0;

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
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1();
}
    boolean lb2 = true;
    fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(lb2, lb3, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    double ld4 = 945.8764454568785;
    double ld5 = 868.8753858758369;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld4);
}
    ld5 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, lb3);
}
    ld4 *= -1;
    Thought lo6 = Thought47.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld4, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return lb2;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[7][1] += ad2;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1);
    fd1 = ad1 + ad2;
        fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought83.getInstance(fd0, fd1, ad1, ad2);

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
    Output.points[7][2] -= ad1;
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
    Output.points[7][3] += fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1();
}
    Thought lo0 = Thought302.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    Thought lo1 = Thought325.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return ab3;
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
    Thought lo0 = Thought239.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2();
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        Output.points[7][4] -= fd0;
        double ld1 = 763.0584179230046;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > ld1;
        fd0 = fd1 + ld1;
if(ao2 != null){
          ao2.m1(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
}
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
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    fb1 = !fb0;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought261.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fb1 = fo1.m2();
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb2);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Thought lo3 = Thought117.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
    ad4 = fd0 + fd1;
    Output.points[7][5] -= ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
}
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return lb4;
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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought188.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = fb1 || ab1;
    fd1 *= -1;
    ab2 = ab3 || ab4;
    double ld1 = 719.6592458266258;
    ld1 *= -1;
    fd0 *= -1;
    double ld2 = 618.0695841370981;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fb1 || ab1;
    Output.points[7][6] -= ld1;
    ab2 = ld2 < fd0;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fd1 = ld1 - ld2;
    fb1 = lb3 && ab1;

Thought.STACK_COUNTER++;
return ab2;
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    Output.points[7][7] -= ad3;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb0 = !ab1;
if(ao4 != null){
      ao4.m1(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3();
}
if(ao1 != null){
          fo1 = ao1.m4(lb0, lb1, ab1, ab2);
}
        boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    double ld0 = 579.3827386264729;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought239.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
    Output.points[7][8] += fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought52.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought250.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fd0 *= -1;
    Output.points[8][0] += fd1;
    fd0 = fd1 + fd0;
    boolean lb5 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        Thought lo1 = Thought252.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb0 = fb0 && fb1;
        Thought lo2 = Thought284.getInstance(lb0, fb0, fb1, lb0);
        Thought lo3 = Thought339.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + ad1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ad2 *= -1;
        ad3 *= -1;
        Thought lo4 = Thought261.getInstance(ad4, fd0, fd1, ad1);
        double ld5 = 289.5434352259887;
        fb1 = ad1 < ad2;
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld5);
}
        Thought lo6 = Thought280.getInstance();
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        Thought lo7 = Thought211.getInstance(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
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
    ad2 *= -1;
    Output.points[8][1] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    boolean lb0 = false;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought347.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 150.94406373497236;
    Thought lo3 = Thought261.getInstance(ad2, ad3, ad4, fd0);
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, ad1, ad2);
}
    ad3 *= -1;
    ab4 = fb0 || fb1;
    ad4 = fd0 + fd1;
    Thought lo5 = Thought366.getInstance();
    Thought lo6 = Thought135.getInstance(lb0, lb4, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = lb4 && ab1;
    ab2 = ab3 || ab4;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, ad1, ad2, fb1, lb0, lb4, ab1);
}
    Thought lo7 = Thought192.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    boolean lb8 = false;

Thought.STACK_COUNTER++;
return ad3;
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
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    double ld0 = 7.179363950710847;
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
    fb1 = ld0 < fd0;
    fb0 = fd1 < ld0;
    Output.points[8][2] += fd0;
    Output.points[8][3] += fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    if (fb0) {
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, fb0, fb1);
}
        lb1 = fd1 < ld0;
        fd0 = fd1 + ld0;
        fd0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        double ld2 = 444.110727701384;
if(ao4 != null){
          fb0 = ao4.m2(fd0, fd1, ld2, ld0);
}
        fb1 = lb1 || fb0;
        } else {
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3();
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            fb1 = fb0 && fb1;
            fb0 = fb1 || fb0;
if(ao3 != null){
              ad2 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
            fb1 = fd1 > ad1;
if(fo0 != null){
              ad2 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
            Output.points[8][4] -= ad3;
            fb0 = !fb1;
if(ao4 != null){
              ao4.m3(fo0, fo1, ao1, ao2);
}
            ad4 = fd0 + fd1;
            fb0 = ad1 > ad2;
if(ao4 != null){
              ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
            ad1 *= -1;
            Thought lo0 = Thought291.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought127.getInstance();
    Thought lo1 = Thought347.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb2 = false;
    Thought lo3 = Thought148.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        fb1 = fd1 > fd0;
    lb2 = ab1 && ab2;
    ab3 = ab4 && fb0;
    double ld4 = 650.1332049718263;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld4, fd0, fd1);
}
    fb1 = ld4 < fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][5] -= ad1;
    double ld0 = 279.7083129776527;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought383.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(ao1 != null){
      ab1 = ao1.m2(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld2 = 658.1235099534999;
    fb1 = !ab1;
    boolean lb3 = false;
    ab1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld0, ld2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld4 = 976.9624036571307;
if(ao2 != null){
      ao2.m1();
}

Thought.STACK_COUNTER++;
return ad4;
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
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought63.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    for(int i0=0; i0<10; i0++){
        lb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fd0 *= -1;
        fb0 = fb1 || lb0;
        }
    lb1 = !fb0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought65.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Output.points[8][6] -= fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought71.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 && fb1;
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[8][7] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo1 = Thought108.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb2);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        fb1 = ad2 < ad3;
        ad4 *= -1;
        Thought lo3 = Thought308.getInstance(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    Output.points[8][8] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return fo1;
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
    double ld0 = 676.6491289208208;
    fb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = ld0 - fd0;
    Output.points[0][0] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 || lb1;
if(ao3 != null){
      fb0 = ao3.m2(ld0, fd0, fd1, ld0);
}
    Output.points[0][1] += fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    boolean lb2 = true;
    Thought lo3 = Thought14.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
    double ld4 = 398.8840490652237;
if(ao2 != null){
      ld4 = ao2.m3();
}
    fd0 = fd1 - ld0;
    ld4 *= -1;
    Thought lo5 = Thought267.getInstance(fb0, fb1, lb1, lb2);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld4, fb0, fb1, lb1, lb2);
}

Thought.STACK_COUNTER++;
return ao3;
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
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    Output.points[0][2] -= ad1;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad2 = ad3 - ad4;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    Output.points[0][3] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Output.points[0][4] += ad2;
    boolean lb2 = false;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(lb0, lb1, lb2, fb0);
}
    Output.points[0][5] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    double ld3 = 522.6501698723521;
    lb1 = ad3 < ad4;
    lb2 = fb0 && fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    boolean lb0 = false;
    ab1 = !ab2;
    fd1 *= -1;
    ab3 = fd0 < fd1;
    Thought lo1 = Thought195.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
          fo1 = ao1.m4();
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought95.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    ab3 = fd0 > fd1;
    fd0 *= -1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;

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
    double ld0 = 950.4138951634402;
    ab1 = ld0 < ad1;
    ab2 = ad2 < ad3;
    double ld1 = 671.5044555395743;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    double ld2 = 254.61131534573107;
    ld0 *= -1;
    boolean lb3 = true;
    ab2 = !ab3;
    boolean lb4 = true;
    ab3 = ld1 < ld2;
    Output.points[0][6] += ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao4.m3();
}
    fd1 = ld0 + ld1;
    Output.points[0][7] += ld2;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb3);
}
    Thought lo5 = Thought164.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);

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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
        fb0 = fd1 < fd0;
    Thought lo1 = Thought232.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    lb2 = lb3 && fb0;
    fd0 = fd1 + fd0;
    Thought lo4 = Thought45.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fb1 = lb0 || lb2;
    lb3 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo5 = Thought109.getInstance(fb0, fb1, lb0, lb2);
    lb3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fd0 = fd1 - fd0;
        lb3 = fd1 < fd0;

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
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought177.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    Thought lo2 = Thought358.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb3 = true;

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
    double ld0 = 20.441837045600767;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 842.6218272109354;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    lb2 = !fb0;
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ld1, lb2, fb0, fb1, lb2);
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
}
