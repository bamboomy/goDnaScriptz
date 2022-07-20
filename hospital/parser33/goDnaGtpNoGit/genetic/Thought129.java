package genetic;
import java.util.ArrayList;
class Thought129 extends Thought{
private static ArrayList<Thought129> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 460.3520469337377;
private double fd1 = 565.6234305473613;
private Thought fo0 = null;
private Thought fo1 = null;
Thought129 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought129 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought129 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought129 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought129 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought129 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought129 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought129 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought129 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought129 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought129 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought129 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought129 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought129 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought129 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought129 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought129 instance = new Thought129 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    double ld1 = 743.2699437321621;
    ld1 = fd0 + fd1;
    Output.points[7][1] -= ld1;
    double ld2 = 952.5038128511517;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
    lb3 = !fb0;
if(fo0 != null){
      fo0.m2(ld2, fd0, fd1, ld1, fb1, lb0, lb3, fb0);
}
    boolean lb4 = true;
    ld2 *= -1;

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
    double ld0 = 448.70294782033375;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    Thought lo1 = Thought339.getInstance();
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
        for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        fd1 *= -1;
        double ld3 = 609.8600895937741;
        ld3 = ld0 + fd0;
        fd1 = ld3 + ld0;
        Thought lo4 = Thought67.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
        lb2 = fd0 < fd1;
        }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb5 = true;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    if (ab2) {
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
      ad1 = fo1.m3();
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fb0 || fb1;
        fd1 = ad1 + ad2;
        fb0 = !fb1;
        double ld0 = 193.4862539678004;
        fb0 = fb1 && fb0;
        boolean lb1 = true;
        Thought lo2 = Thought289.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
        fd1 = ld0 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
        Thought lo3 = Thought396.getInstance(fo1, fo0, fo1, fo0);
        Thought lo4 = Thought162.getInstance(ad2, ad3, ad4, fd0);
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
    boolean lb0 = true;
    Thought lo1 = Thought204.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m2(lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    lb0 = lb2 || ab1;
    ab2 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    lb2 = ad2 > ad3;
    ab1 = ab2 && ab3;
    ab4 = ad4 < fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;

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
    Thought lo0 = Thought391.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld3 = 562.5399490729009;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0);
}
    fd1 = ld3 + fd0;
    lb1 = !lb2;

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
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = false;
    Thought lo1 = Thought208.getInstance(lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    Output.points[7][2] += fd0;
    fd1 = ad1 + ad2;
    fb1 = lb0 || fb0;
    Thought lo2 = Thought213.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
    Thought lo3 = Thought5.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
        ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought64.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 45.101863809862714;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Thought lo3 = Thought91.getInstance(ab2, ab3, ab4, fb0);
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
          ao3.m2(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    double ld0 = 686.2838283853866;
    double ld1 = 802.1741497649031;
    ab1 = ad3 > ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ld0, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb1 = fd1 > ld0;
    ld1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ab1 = ld0 < ld1;

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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[7][3] += fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought330.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo2 = Thought11.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    fd1 *= -1;
    boolean lb3 = false;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return lb3;
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
    ab1 = ab2 && ab3;
    Thought lo0 = Thought264.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought391.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
    Output.points[7][4] += fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought343.getInstance(fo1, fo0, fo1, fo0);
    fb1 = !lb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 308.8217015224329;
    fb0 = ad2 > ad3;
    ad4 *= -1;
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ld0 *= -1;
    double ld1 = 341.39723251764076;
    Output.points[7][5] += ld1;
    fb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought110.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab3 = fd0 > fd1;
        ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb1 = fd1 > ad1;
    ab1 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    double ld0 = 704.7636324555258;
    fb0 = fb1 && fb0;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    double ld1 = 56.01491660435281;
    double ld2 = 333.9141307749085;
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[7][6] -= ld1;

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
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fb0 && fb1;
    fd1 = ad1 - ad2;
    boolean lb0 = true;
    Thought lo1 = Thought12.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    fb0 = ad4 > fd0;
    Thought lo3 = Thought257.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, lb2, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb0, lb2, fb0, fb1);
}
    lb0 = ad4 < fd0;
    fd1 = ad1 - ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    lb0 = !ab1;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        double ld2 = 712.7903526962899;
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld3 = 336.75569132467905;
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld2, fb1, lb0, lb1, ab1);
}
if(ao1 != null){
          fo1 = ao1.m4(ld3, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
}
        ld3 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, ab1);
}
        boolean lb4 = true;
        ab1 = ab2 && ab3;
        ld2 *= -1;
        double ld5 = 101.99045000892141;
        double ld6 = 728.4366538953695;
        for(int i1=0; i1<10; i1++){
            double ld7 = 925.73319589239;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab2 = ad3 < ad4;
    ab3 = ab4 && fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ad1;
    Output.points[7][7] -= ad2;
    double ld2 = 169.2693513191421;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
    lb3 = fd0 < fd1;
    ab1 = ld2 > ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3);
}
    Output.points[7][8] += ad4;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 = ld2 + ad1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 < ad3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    lb1 = fd0 > fd1;
        fb0 = fd0 > fd1;
    fb1 = lb0 || lb1;
    double ld2 = 719.0174799578357;
    fb0 = !fb1;
    Output.points[8][0] -= ld2;

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
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought131.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    Output.points[8][1] -= fd0;
    Thought lo1 = Thought255.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    Thought lo2 = Thought233.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(fo1 != null){
      fo1.m3();
}
    Output.points[8][2] += fd1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m1(fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb3 = false;
    Thought lo4 = Thought139.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
    fd1 *= -1;
    lb3 = ab1 || ab2;
    Output.points[8][3] -= fd0;

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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought209.getInstance();
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb0;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb2);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        ab3 = ab4 || fb0;
        double ld0 = 750.3103228655756;
        ld0 = ad1 - ad2;
        double ld1 = 397.258400526198;
        fb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo1 != null){
          fo1.m1(ld0, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        Thought lo2 = Thought45.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
        ad3 = ad4 - fd0;
        Output.points[8][4] += fd1;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Thought lo3 = Thought186.getInstance(ld0, ld1, ad1, ad2);
        ad3 = ad4 + fd0;
        double ld4 = 978.4642185213622;
        Output.points[8][5] -= fd0;
        boolean lb5 = false;
        Output.points[8][6] -= fd1;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld4, ad1, ad2);
}
        Output.points[8][7] += ad3;
        ab2 = ad4 > fd0;
        Thought lo6 = Thought290.getInstance();
}
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fd1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
        Output.points[8][8] += fd0;
        fb0 = fb1 || lb0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        double ld1 = 76.37940445393559;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
        fb0 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          ld1 = ao3.m3(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
        boolean lb2 = true;
        fb0 = ld1 > fd0;
        fb1 = fd1 < ld1;
        boolean lb3 = true;
        lb0 = lb2 && lb3;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb0, lb2, lb3);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, fb1, lb0, lb2, lb3);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb0);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        Thought lo4 = Thought109.getInstance(ld1, fd0, fd1, ld1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    if (fb0) {
        double ld0 = 141.1167883772782;
        ld0 *= -1;
        fb1 = ad1 < ad2;
        ad3 = ad4 - fd0;
        double ld1 = 54.46168396347492;
        boolean lb2 = false;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1);
}
        ad2 = ad3 - ad4;
        } else if (fb0) {
if(ao1 != null){
          ao1.m3();
}
        Output.points[0][0] += ad1;
        boolean lb3 = true;
        } else if (fb1) {
        Output.points[0][1] -= ad2;
if(ao2 != null){
          fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + ad1;
        fb0 = ad2 > ad3;
        ad4 = fd0 - fd1;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fb0 = ad1 < ad2;
        Thought lo4 = Thought140.getInstance(ad3, ad4, fd0, fd1);
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        Thought lo5 = Thought372.getInstance();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought352.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld1 = 795.952785865648;
    ld1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab4 = fb0 && fb1;
    Output.points[0][2] += fd0;
    fd1 = ld1 - fd0;
    Thought lo2 = Thought316.getInstance(fd1, ld1, fd0, fd1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    ab1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ld1 *= -1;
    boolean lb3 = true;
    fd0 = fd1 + ld1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb3, ab1);
}
    if (ab2) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought393.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
    double ld1 = 414.3306926035341;
    fb1 = !ab1;
if(ao4 != null){
      ad2 = ao4.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    if (ab1) {
        ab2 = fd0 < fd1;
        ab3 = ld1 > ad1;
        ab4 = ad2 < ad3;
        fb0 = fb1 || ab1;
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
    fb1 = !fb0;
    double ld0 = 263.2721896662754;
    Thought lo1 = Thought127.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought309.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    if (fb1) {
        double ld3 = 199.76886079363777;
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    Output.points[0][3] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    double ld1 = 113.76172897487791;
    fd0 = fd1 - ld1;
    ab4 = fd0 < fd1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought225.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought250.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
        double ld3 = 415.13146277271676;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
        lb2 = ld3 < ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo0.m2(ld3, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
}
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
      fo1 = fo0.m4();
}
    Output.points[0][4] -= ad2;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, ab1, ab2);
}
    ab3 = ad3 < ad4;
    fd0 *= -1;
    Thought lo1 = Thought219.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought153.getInstance(fo1, fo0, fo1, fo0);
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo3 = Thought143.getInstance();
    boolean lb4 = false;
    ab4 = ad4 > fd0;
    boolean lb5 = false;
    Output.points[0][5] -= fd1;
    ab4 = fb0 && fb1;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(lb0, lb4, lb5, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo6 = Thought97.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb4);
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4, lb5, ab1, ab2, ab3);
}

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
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo0 = Thought383.getInstance(fo1, ao1, ao2, ao3);
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought272.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Output.points[0][6] -= fd0;
    fd1 = fd0 - fd1;
    Output.points[0][7] += fd0;
if(ao4 != null){
      ao4.m3();
}
    fb0 = fb1 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][8] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd0 *= -1;
    if (fb0) {
        fb1 = lb0 || fb0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        Output.points[1][0] += ad4;
        boolean lb1 = false;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, lb1, lb0, fb0, fb1);
}
        lb1 = fd0 > fd1;
        Thought lo2 = Thought22.getInstance(ao4, fo0, fo1, ao1);
        ad1 *= -1;
        boolean lb3 = false;
        ad2 *= -1;
}
Thought.STACK_COUNTER++;
return ao2;
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
    boolean lb0 = false;
    if (ab1) {
        double ld1 = 586.7270856472456;
if(ao1 != null){
          ab2 = ao1.m2(ld1, fd0, fd1, ld1);
}
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
        ab4 = !fb0;
if(ao1 != null){
          fd1 = ao1.m3();
}
        ld1 = fd0 + fd1;
        fb1 = lb0 || ab1;
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
        ld1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
        Output.points[1][1] -= fd0;
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    ad1 *= -1;
    fb0 = fb1 && ab1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    fb0 = fb1 && fb0;
    Output.points[1][2] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 305.76056892305496;
if(fo1 != null){
      fo1.m3();
}
    fd0 *= -1;
    fd1 = ld1 + fd0;

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
    fb0 = fd0 > fd1;
    Thought lo0 = Thought367.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[1][3] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    Output.points[1][4] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, fb0, fb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought31.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought371.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought6.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld3 = 480.2101101406305;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    fb0 = fb1 && fb0;
    fd1 *= -1;
    ld3 = fd0 + fd1;
    fb1 = fb0 && fb1;
    double ld4 = 149.05325113941927;
if(fo1 != null){
          fo0 = fo1.m4();
}
    ld3 = ld4 - fd0;
    double ld5 = 321.7362046390812;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld4, fb0, fb1, fb0, fb1);
}
    ld5 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, ld4, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
    double ld6 = 79.68853331467083;

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
