package genetic;
import java.util.ArrayList;
class Thought175 extends Thought{
private static ArrayList<Thought175> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 551.2312385782669;
private double fd1 = 424.3769561592522;
private Thought fo0 = null;
private Thought fo1 = null;
Thought175 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought175 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought175 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought175 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought175 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought175 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought175 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought175 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought175 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought175 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought175 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought175 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought175 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought175 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought175 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought175 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought175 instance = new Thought175 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought369.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[8][8] += fd1;
    fb1 = fd0 < fd1;
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = fb0 || fb1;
        Thought lo1 = Thought288.getInstance(fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo1 != null){
          fo1.m1(fb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
        fb0 = fd0 < fd1;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
        Thought lo3 = Thought110.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
        fb1 = fd0 < fd1;
        fd0 = fd1 + fd0;
        boolean lb4 = false;
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    Thought lo0 = Thought308.getInstance();
    Thought lo1 = Thought225.getInstance(ab4, fb0, fb1, ab1);
        fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 > fd1;
        ab1 = ab2 || ab3;
        fd0 = fd1 - fd0;
        Output.points[0][0] -= fd1;
if(fo1 != null){
          ab4 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Thought lo2 = Thought161.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
        boolean lb3 = true;
        lb3 = fd0 > fd1;
        double ld4 = 47.069078223929544;
        ab1 = !ab2;
        boolean lb5 = true;
        ld4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo6 = Thought89.getInstance(ld4, fd0, fd1, ld4);
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
    ad2 = ad3 - ad4;
    Thought lo0 = Thought388.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    fb1 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb1;
    ad3 *= -1;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb1, lb2, fb0, fb1);
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    ad3 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    double ld0 = 208.8358186358801;
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    Output.points[0][1] += ad2;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad2 < ad3;
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
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
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought113.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        double ld2 = 172.43163213141764;
        Thought lo3 = Thought20.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
        fb1 = fd0 > fd1;
        lb1 = !fb0;
if(fo0 != null){
          ld2 = fo0.m3(fo1, ao1, ao2, ao3);
}
        Thought lo4 = Thought213.getInstance(fd0, fd1, ld2, fd0);
        fb1 = lb1 && fb0;
        Output.points[0][2] -= fd1;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
        fd0 = fd1 - ld2;
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
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3();
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[0][3] -= ad2;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    double ld0 = 624.2188563206516;
    ad2 = ad3 - ad4;
    double ld1 = 187.3243267163633;
    fb0 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ad1, fb1, fb0, fb1, fb0);
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
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought205.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        }
    ab3 = fd0 > fd1;
    ab4 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;

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
    Thought lo0 = Thought375.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab1 = fd0 < fd1;
    ab2 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ab3, ab4, fb0, fb1);
}
    Output.points[0][4] += ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    double ld1 = 955.1766007381073;
    Output.points[0][5] += ld1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb2 = false;
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        ad1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought117.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld1 = 386.96108681171717;
        ld1 *= -1;
    Output.points[0][6] -= fd0;
    boolean lb2 = true;
    double ld3 = 536.1822785555995;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld1 = fo0.m3(ld3, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
    lb2 = ld3 > fd0;
    Thought lo4 = Thought380.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    fb1 = !lb2;
    fd1 *= -1;
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
    ld1 = ld3 - fd0;
    double ld5 = 777.3279039877813;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, ld3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought143.getInstance();
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    Output.points[0][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
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
    double ld0 = 541.1458615722468;
    fb1 = ad1 > ad2;
    ad3 *= -1;
    fb0 = ad4 < fd0;
    fd1 = ld0 + ad1;
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought279.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Output.points[0][8] += fd1;
    ld0 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
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
    Thought lo0 = Thought318.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
    boolean lb1 = true;
    ad4 *= -1;
    ab4 = fd0 < fd1;
    fb0 = fb1 && lb1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        Output.points[1][0] -= fd0;
        ab2 = !ab3;
        Output.points[1][1] += fd1;
        ad1 = ad2 + ad3;
}
Thought.STACK_COUNTER++;
return ab4;
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
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    double ld1 = 499.1516164904061;
    double ld2 = 641.8765376169599;
    ld2 = fd0 - fd1;
    boolean lb3 = false;
    double ld4 = 55.88473588666614;
    lb0 = lb3 || fb0;
    double ld5 = 167.18429691944885;
    fb1 = ld1 > ld2;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb3, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ld4, ld5, fd0, fd1, lb3, fb0, fb1, lb0);
}
    ld1 = ld2 + ld4;
    Output.points[1][2] += ld5;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ld2, lb3, fb0, fb1, lb0);
}
    ld4 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, lb3, fb0, fb1, lb0);
}
    boolean lb6 = false;
    boolean lb7 = false;
    lb3 = lb6 || lb7;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought266.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    fb0 = ad2 < ad3;
    Thought lo1 = Thought97.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
if(ao4 != null){
      ao4.m1();
}
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    if (fb1) {
        boolean lb2 = false;
        } else if (fb0) {
        fb1 = ad3 < ad4;
        fd0 = fd1 - ad1;
        Thought lo3 = Thought159.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        fb0 = fd1 < ad1;
        fb1 = ad2 > ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    double ld0 = 933.554708109425;
    boolean lb1 = true;
    double ld2 = 636.1908347230261;
    ab1 = ld2 < fd0;
    boolean lb3 = false;
    Thought lo4 = Thought226.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, ld2, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[1][3] += fd1;

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
    ab2 = ad1 < ad2;
    ad3 *= -1;
    ab3 = !ab4;
    ad4 = fd0 - fd1;
    double ld0 = 3.3131571341195336;
    fb0 = !fb1;
    ld0 *= -1;
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought22.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = ad3 > ad4;
    fd0 *= -1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = ld0 + ad1;
    ad2 *= -1;
    Thought lo3 = Thought65.getInstance(ad3, ad4, fd0, fd1);
    Thought lo4 = Thought302.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    ld0 *= -1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    Output.points[1][4] += fd1;
    Thought lo1 = Thought314.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fb0 = fb1 || lb0;
    lb2 = fb0 && fb1;
    fd1 *= -1;
    lb0 = lb2 || fb0;
    double ld3 = 120.04036424969851;
if(fo1 != null){
      fo1.m1(ld3, fd0, fd1, ld3, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    boolean lb4 = false;
    fb0 = fd0 > fd1;
    fb1 = lb0 && lb2;
    lb4 = ld3 < fd0;
    Output.points[1][5] -= fd1;
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld3, fd0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Thought lo0 = Thought121.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
          ab4 = fo1.m2();
}
    double ld1 = 910.5494733135449;
    ld1 *= -1;
    fd0 *= -1;
    fb0 = fd1 > ld1;
    fd0 = fd1 - ld1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    Output.points[1][6] -= fd0;
    double ld3 = 642.330496170265;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    Output.points[1][7] += ad1;
    boolean lb2 = true;
    lb2 = ad2 < ad3;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}
    fb0 = !fb1;
    lb0 = ad1 > ad2;
    lb1 = ad3 < ad4;
    fd0 *= -1;
    lb2 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    double ld3 = 129.7320798783686;
    lb2 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    lb0 = fd0 < fd1;
    ld3 = ad1 + ad2;
    ad3 = ad4 - fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
    ab1 = ab2 && ab3;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought362.getInstance(fo0, fo1, fo0, fo1);
    Thought lo2 = Thought113.getInstance(fd0, fd1, ad1, ad2);
    ab4 = fb0 && fb1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    lb0 = fd0 > fd1;
    Thought lo3 = Thought351.getInstance();
    ab1 = ab2 && ab3;
    if (ab4) {
        ad1 *= -1;
        Output.points[1][8] -= ad2;
        } else if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
        boolean lb4 = true;
        ab2 = ab3 && ab4;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb4, lb0);
}
        fd0 *= -1;
        Thought lo5 = Thought362.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
        fb0 = !fb1;
        double ld6 = 769.2397700196009;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
        Output.points[2][0] -= fd1;
    Output.points[2][1] -= fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    double ld0 = 682.9348626735791;
    fb1 = fd0 > fd1;
    boolean lb1 = true;
    lb1 = ld0 > fd0;
    fb0 = fd1 < ld0;
    fb1 = lb1 && fb0;
    fd0 *= -1;
    Thought lo2 = Thought5.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
    fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
    Output.points[2][2] -= fd0;
    fd1 = ld0 + fd0;
    Output.points[2][3] -= fd1;
        Output.points[2][4] += ld0;
    fd0 = fd1 + ld0;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 399.05173416134556;
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought318.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[2][5] += ld0;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
    ad2 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(ao2 != null){
      ab2 = ao2.m2();
}
    ab3 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    double ld0 = 471.7274999624602;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
    ab1 = fd1 < ld0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab2 = !ab3;
    Output.points[2][6] += ad4;
    ab4 = fb0 && fb1;
    Output.points[2][7] -= fd0;
    ab1 = !ab2;
    Output.points[2][8] += fd1;
    Output.points[3][0] += ad1;
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        ad2 = ad3 - ad4;
        Thought lo0 = Thought134.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ad3 = ad4 + fd0;
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
    fd0 = fd1 + fd0;
    Output.points[3][1] -= fd1;
    Thought lo0 = Thought51.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Output.points[3][2] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2();
}
    double ld2 = 939.2554133795625;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, lb3, fb0, fb1, lb1);
}
    ld2 = fd0 + fd1;
    double ld4 = 590.7388358769599;

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    double ld1 = 160.21753377116687;
    Output.points[3][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    double ld2 = 113.42952817776191;
    fd0 = fd1 - ld1;
if(fo1 != null){
      ld2 = fo1.m3();
}
    boolean lb3 = false;
    ab1 = ab2 && ab3;
    if (ab4) {
        fd0 *= -1;
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
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
        double ld0 = 259.36415367778676;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    Output.points[3][4] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Output.points[3][5] += ad4;
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    fb1 = ad1 > ad2;
    ab1 = ad3 < ad4;
    double ld0 = 917.4121937428607;

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
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    if (fb1) {
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        fb1 = !fb0;
        Thought lo0 = Thought43.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        Output.points[3][6] -= fd0;
        fb1 = !fb0;
        fb1 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb0 = !fb1;
        fb0 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        fb1 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao4.m1();
}
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        Thought lo1 = Thought335.getInstance(fb1, fb0, fb1, fb0);
        boolean lb2 = true;
        fb0 = fb1 || lb2;
        fb0 = !fb1;
        double ld3 = 625.9643749112292;
        lb2 = fd0 < fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    ad2 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    boolean lb1 = true;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
    fb0 = !fb1;
    lb0 = !lb1;
    Thought lo3 = Thought367.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
    lb0 = lb1 && lb2;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
              ad2 = ao4.m3(ad3, ad4, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
        lb0 = ab1 || ab2;
    Output.points[3][7] += fd0;
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(ao3 != null){
          ao3.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
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
    boolean lb0 = true;
    double ld1 = 151.41377762849922;
    lb0 = ab1 || ab2;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought204.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    boolean lb3 = true;
    Output.points[3][8] -= ad4;
    double ld4 = 253.11648311396814;
    double ld5 = 857.6197698441798;
    ad3 = ad4 + fd0;
    lb0 = fd1 > ld1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo0 != null){
          fb0 = fo0.m2();
}
    Thought lo1 = Thought324.getInstance(fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought26.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    boolean lb3 = true;
    double ld4 = 748.175798690507;
    fb0 = fb1 || lb0;
    boolean lb5 = true;
    Thought lo6 = Thought126.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(ld4, fd0, fd1, ld4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
    Thought lo0 = Thought386.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = true;
    double ld4 = 579.7055253630389;
    double ld5 = 637.1617324006083;
    double ld6 = 335.1361358628454;
    ld4 = ld5 + ld6;
    fd0 = fd1 + ld4;
    double ld7 = 596.7309065230805;
        lb3 = fb0 || fb1;
    Thought lo8 = Thought4.getInstance(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
    ld5 *= -1;
    boolean lb9 = false;
    ld6 *= -1;
    lb2 = lb3 && lb9;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    double ld0 = 876.8421401962282;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    double ld1 = 769.6185086814719;
if(fo1 != null){
          ld0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[4][0] -= ld1;
    fb1 = fb0 && fb1;
        fd0 = fd1 - ld0;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought128.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought375.getInstance(fo0, fo1, fo0, fo1);
    lb3 = ld0 < ld1;
    Thought lo5 = Thought113.getInstance(fd0, fd1, ld0, ld1);

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
